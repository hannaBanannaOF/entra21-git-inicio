import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        //  MORTE AO LIGHT MODE
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número de linhas: ");
        int linhas = in.nextInt();
        System.out.print("Digite o número de colunas: ");
        int colunas = in.nextInt();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
