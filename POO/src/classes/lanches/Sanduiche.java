package classes.lanches;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public abstract class Sanduiche extends Lanche{

    private HashMap<String, Double> adicionais = new HashMap<>();

    public void adicionarAdicional(String adicional, double valor) {
        this.adicionais.put(adicional, valor);
    }

    public HashMap<String, Double> getAdicionais() {
        return adicionais;
    }

    @Override
    public void mostrarDetalhesComanda() {
        System.out.println("====" + this.getTipo() + "====");
        if (!this.adicionais.isEmpty()) {
            System.out.println("-ADICIONAIS-");
            for (String adicional : this.getAdicionais().keySet()) {
                System.out.printf("%s: R$%.2f\n",adicional, this.getAdicionais().get(adicional));
            }
        }
    }

    @Override
    public void montarDetalhesLanche(Scanner in) {
        System.out.println("Deseja adicionais? (S/N)");
        String adiconais = in.nextLine();
        if (adiconais.equalsIgnoreCase("S")) {
            for(int i = 0; i < 10; i++) {
                System.out.print("Informe o adicional: ");
                String nomeAdicional = in.nextLine();
                System.out.print("Informe o valor do adicional: R$");
                this.adicionarAdicional(nomeAdicional, in.nextDouble());
                in.nextLine();
                System.out.println("Deseja adicionar mais adicionais? (S/N)");
                String parada = in.nextLine();
                if (parada.equalsIgnoreCase("N")) {
                    break;
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
