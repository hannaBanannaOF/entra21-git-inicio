import classes.Voo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int linhas = 0, col = 0;
        while (true) {
            System.out.print("Informe o número de linhas de assentos: ");
            linhas = in.nextInt();
            if (linhas <= 26) {
                break;
            } else {
                System.out.println("QUANTIDADE DE LINHAS DEVE SER <= 26!");
            }
        }
        while (true) {
            System.out.print("Informe o número de cadeiras por linha: ");
            col = in.nextInt();
            if (col <= 10) {
                break;
            } else {
                System.out.println("QUANTIDADE DE CADEIRAS POR LINHA DEVE SER <= 10!");
            }
        }
        in.nextLine();

        Voo v = new Voo(linhas,col);
        while(v.quantidadeLivre() > 0) {
            v.mostrarAssentos();
            System.out.println("Informe o código do assento: ");
            String cod = in.nextLine();
            if (!v.verificaOcupacao(cod)) {
                v.ocupar(cod);
                if (v.quantidadeLivre() == 0) {
                    break;
                }
                System.out.println("Deseja vender outra passagem? (S/N)");
                String res = in.nextLine();
                if (res.equalsIgnoreCase("N")) {
                    break;
                }
            } else {
                System.out.println("CADEIRA OCUPADA! SELECIONE OUTRA CADEIRA!");
            }
        }
        v.mostrarAssentos();
        System.out.println("BOA VIAGEM!");
    }
}
