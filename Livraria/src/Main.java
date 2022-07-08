import classes.EMenu;
import classes.EMenuItem;
import classes.IMenu;
import classes.Loja;
import classes.guardados.Estante;
import classes.itens.DVD;
import classes.itens.Item;
import classes.itens.Livro;
import org.jetbrains.annotations.NotNull;

import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);

    static Loja loja = new Loja();

    public static void main(String[] args) {
        boolean loop = true;
        while (loop) {
            try {
                EMenu opcao = (EMenu) escolherOpcao(null);
                switch (opcao) {
                    case SAIR -> loop = false;
                    case ADICIONAR_ITEM -> adicionarItem();
                    case BUSCAR_ITEM -> buscarItemETratarRetorno();
                    case REMOVER_ITEM -> removerItem();
                    case MOSTRAR_ITENS -> mostarItens();
                    case ADICIONAR_ESTANTE -> adicionarEstante();
                    default -> System.out.println("Opção não implementada!");
                }
                System.out.println();
            } catch (Exception e) {
                if (in.hasNext()) {
                    in.nextLine();
                }
                System.out.println("Aconteceu algum problema!");
                e.printStackTrace();
            }
        }
        System.out.println("Programa finalizado!");
    }

    private static void adicionarEstante() {
        while (true) {
            System.out.print("Informe um identificador: ");
            String id = in.nextLine().toLowerCase();
            if (loja.getEstantes().containsKey(id)) {
                System.out.println("Identificador já utilizado!");
            } else {
                System.out.print("Informe a capacidade máxima da estante: ");
                loja.getEstantes().put(id, new Estante(in.nextInt()));
                in.nextLine();
                break;
            }
        }
    }

    public static IMenu escolherOpcao(Item item) {
        while (true) {
            try {
                if (item != null) {
                    System.out.println(item.getTitulo() + " encontrado! Ações disponíveis: ");
                    for (EMenuItem i : EMenuItem.values()) {
                        System.out.printf("(%d) %s\n", i.getValorOpcao(), i.getDescricao());
                    }
                    return EMenuItem.getByValorOpcao(in.nextInt());
                } else {
                    System.out.println("Selecione uma opção");
                    for (EMenu menu : EMenu.values()) {
                        System.out.printf("(%d) - %s\n", menu.getValorOpcao(), menu.getDescricao());
                    }
                    return EMenu.getByValorOpcao(in.nextInt());
                }
            } catch(RuntimeException e) {
                System.out.println("Selecione uma opção válida!");
            } finally {
                in.nextLine();
            }
        }
    }

    // Adicionar item na estante
    public static void adicionarItem() {
        if (loja.getEstantes().isEmpty()) {
            System.out.println("Sem estantes!");
        } else {
            Estante e = buscarEstante();
            if (e.estanteCheia()) {
                System.err.println("Sua estante está cheia! Não é possível adicionar mais itens!");
            } else {
                Item i;
                int escolha = -1;
                while (escolha < 0 || escolha > 1) {
                    System.out.print("Informe o item que deseja adicionar (0 - Livro / 1 - DVD): ");
                    escolha = in.nextInt();
                    if (escolha < 0 || escolha > 1) {
                        System.err.println("Selecione uma opção válida");
                    }
                }
                in.nextLine();
                if (escolha == 0) {
                    i = new Livro();
                } else {
                    i = new DVD();
                }
                System.out.print("Informe o título: ");
                i.setTitulo(in.nextLine());
                System.out.print("Informe o gênero: ");
                i.setGenero(in.nextLine());
                System.out.print("informe o valor: R$");
                i.setValor(in.nextDouble());
                in.nextLine();
                i.montarDetalhes(in);
                if (!e.adicionarItem(i)) {
                    System.err.println("Não foi possível adicionar o item na estante!");
                } else {
                    System.out.println("Item adicionado com sucesso!");
                }
            }
        }
    }

    public static void buscarItemETratarRetorno() {
        if (loja.getEstantes().isEmpty()) {
            System.out.println("Sem estantes!");
        } else {
            System.out.print("Informe o título para busca: ");
            String titulo = in.nextLine();
            Item i = null;
            for (Estante e : loja.getEstantes().values()) {
                i = e.buscarItem(titulo);
                if (i != null) {
                    break;
                }
            }
            if (i == null) {
                System.err.println("O título buscado não existe na loja!");
            } else {
                EMenuItem escolha = (EMenuItem) escolherOpcao(i);
                switch (escolha) {
                    case VOLTAR -> System.out.println("Retornando...");
                    case VER_AVALIACOES -> mostarAvaliacoes(i);
                    case AVALIAR_ITEM -> i.avaliar();
                    case MOSTRAR_DETALHES -> {
                        System.out.println("Título: " + i.getTitulo());
                        System.out.println("Gênero: " + i.getGenero());
                        i.mostrarDetalhes();
                        System.out.printf("Valor: R$%.2f\n", i.getValor());
                    }
                    default -> System.out.println("Não implementado!");
                }
            }
        }
    }

    private static Estante buscarEstante() {
        Estante e = null;
        while(e == null) {
            System.out.print("Informe o identificador da estante: ");
            e = loja.getEstantes().get(in.nextLine().toLowerCase());
            if (e == null) {
                System.out.println("Estante não encontrada!");
            }
        }
        return e;
    }

    public static void mostarAvaliacoes(@NotNull Item i) {
        i.getAvaliacoes().forEach(a -> {
            System.out.println("Autor: "+a.getNome());
            System.out.println(a.getDataAvaliacao().format(DateTimeFormatter.ofPattern("'Data da avaliação: 'dd/MM/yyyy HH:mm:ss'\n'")));
            System.out.println("Avaliação: "+a.getRating());
            System.out.println("Comentário: ");
            System.out.println(a.getFeedback());
            System.out.println("--------------------");
        });
        System.out.println("Classificação final: "+i.getTotalRating());
    }

    public static void removerItem() {
        if (loja.getEstantes().isEmpty()) {
            System.out.println("Sem estantes!");
        } else {
            Estante e = buscarEstante();
            if (e.quantidadeItens() == 0) {
                System.err.println("Não é possível remover itens de uma estante vazia!");
            } else {
                int posicao = -1;
                while (posicao < 0 || posicao > e.quantidadeItens()) {
                    System.out.print("Informe a posição do item para remover: ");
                    posicao = in.nextInt();
                    if (posicao < 0 || posicao > e.quantidadeItens()) {
                        System.err.println("Selecione uma opção válida!");
                    }
                }
                in.nextLine();
                Item i = e.removerItem(posicao);
                System.out.println("Item " + i.getTitulo() + " removido!");
            }
        }
    }

    public static void mostarItens() {
        if (loja.getEstantes().isEmpty()) {
            System.out.println("Sem estantes!");
        }
        for (String key: loja.getEstantes().keySet()) {
            Estante e = loja.getEstantes().get(key);
            System.out.println("Estante: '"+key+"'");
            if (e.quantidadeItens() == 0) {
                System.out.println();
            } else {
                for (int i = 0; i < e.quantidadeItens(); i++) {
                    Item item = e.getItens().get(i);
                    System.out.println("[" + i + "] " + item.getTitulo() + " (" + item.getGenero() + ")");
                }
            }
        }
    }
}
