import classes.ChecklistItem;
import classes.ListaTarefas;
import classes.Tarefa;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Informe a quantidade de tarefas da lista: ");
        ListaTarefas lt = new ListaTarefas(in.nextInt());
        in.nextLine();
        System.out.print("Informe um nome para a lista de tarefas: ");
        lt.setNomeLista(in.nextLine());
        while (true) {
            Tarefa t = criarTarefa();
            if (!lt.adicionarTarefa(t)) {
                System.err.println("Impossível adicionar tarefa!");
                break;
            }
            System.out.println("deseja adicionar mais tarefas? (S/N)");
            String add = in.nextLine();
            if (add.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static Tarefa criarTarefa() {
        Tarefa t = new Tarefa();
        System.out.print("Informe o nome da tarefa: ");
        t.setNome(in.nextLine());
        System.out.print("Informe a descrição da tarefa: ");
        t.setDescricao(in.nextLine());
        System.out.print("Ordem da tarefa: ");
        t.setOrdem(in.nextInt());
        in.nextLine();
        System.out.print("Tarefa tem checklist? (S/N)");
        String checklist = in.nextLine();
        if (checklist.equalsIgnoreCase("S")) {
            System.out.print("Informe o tamanho da checklist: ");
            t.criarChecklist(in.nextInt());
            in.nextLine();
            while (true) {
                ChecklistItem item = new ChecklistItem();
                System.out.print("Informe um nome para o item: ");
                item.setNome(in.nextLine());
                System.out.print("Informe uma descrição para o item: ");
                item.setDescricao(in.nextLine());
                t.adicionarChecklistItem(item);
                System.out.println("deseja adicionar mais itens? (S/N)");
                String add = in.nextLine();
                if (add.equalsIgnoreCase("N")) {
                    break;
                }
            }
        }
        return t;
    }
}
