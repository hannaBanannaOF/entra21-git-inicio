package classes.produtos;

import classes.ConsoleHelper;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Complementable extends Lanche{

    private final HashMap<String, Double> adicionais = new HashMap<>();

    public void adicionarAdicional(String adicional, double valor) {
        this.adicionais.put(adicional, valor);
    }

    public HashMap<String, Double> getAdicionais() {
        return adicionais;
    }

    @Override
    public void mostrarDetalhesComanda() {
        super.mostrarDetalhesComanda();
        if (!this.adicionais.isEmpty()) {
            System.out.println("-ADICIONAIS-");
            for (String adicional : this.getAdicionais().keySet()) {
                System.out.printf("%s: R$%.2f\n",adicional, this.getAdicionais().get(adicional));
            }
        }
    }

    @Override
    public void montarDetalhesProduto(Scanner in) {
        System.out.println("Deseja adicionais? (S/N)");
        String adiconais = in.nextLine();
        if (adiconais.equalsIgnoreCase("S")) {
            while (true) {
                System.out.print("Informe o adicional: ");
                String nomeAdicional = in.nextLine().toLowerCase();
                if (!nomeAdicional.isEmpty() && !nomeAdicional.isBlank()) {
                    if (this.adicionais.containsKey(nomeAdicional)) {
                        if ("N".equalsIgnoreCase(ConsoleHelper.returnYesNoValidOption("Adicional já existe no lanche, deseja atualizar o valor? (S/N)", in))) {
                            continue;
                        }
                    }
                    try {
                        System.out.print("Informe o valor do adicional: R$");
                        this.adicionarAdicional(nomeAdicional, in.nextDouble());
                    } catch (InputMismatchException e) {
                        ConsoleHelper.showError("Selecione uma opção válida");
                    } finally {
                        in.nextLine();
                    }
                    if ("N".equalsIgnoreCase(ConsoleHelper.returnYesNoValidOption("Deseja adicionar mais adicionais? (S/N)", in))) {
                        break;
                    }
                } else {
                    ConsoleHelper.showError("O nome do adicional não pode ser vazio!");
                }
            }
        }
    }

    @Override
    public double getValor() {
        double valorTotal = super.getValor();
        for (Double v : this.adicionais.values()) {
            valorTotal += v;
        }
        return valorTotal;
    }
}
