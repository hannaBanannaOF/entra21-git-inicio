package classes.lanches;

import java.util.Scanner;

public abstract class Sanduiche extends Lanche{

    private String[] adicionais = new String[10];

    public void adicionarAdicional(String adicional) {
        for (int i = 0; i < 10; i++) {
            if(this.adicionais[i] == null) {
                this.adicionais[i] = adicional;
                break;
            }
        }
    }

    public String[] getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(String[] adicionais) {
        this.adicionais = adicionais;
    }

    @Override
    public void mostrarDetalhesComanda() {
        System.out.println("====" + this.getTipo() + "====");
        if (this.getAdicionais()[0] != null) {
            System.out.println("-ADICIONAIS-");
            for (String adicional : this.getAdicionais()) {
                if (adicional != null) {
                    System.out.println(adicional);
                }
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
