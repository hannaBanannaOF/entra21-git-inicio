package classes.lanches;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Sanduiche extends Lanche{

    private ArrayList<String> adicionais = new ArrayList<>();

    public void adicionarAdicional(String adicional) {
        this.adicionais.add(adicional);
    }

    public ArrayList<String> getAdicionais() {
        return adicionais;
    }

    @Override
    public void mostrarDetalhesComanda() {
        System.out.println("====" + this.getTipo() + "====");
        if (!this.adicionais.isEmpty()) {
            System.out.println("-ADICIONAIS-");
            for (String adicional : this.getAdicionais()) {
                System.out.println(adicional);
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
                this.adicionarAdicional(in.nextLine());
                System.out.println("Deseja adicionar mais adicionais? (S/N)");
                String parada = in.nextLine();
                if (parada.equalsIgnoreCase("N")) {
                    break;
                }
            }
        }
    }
}
