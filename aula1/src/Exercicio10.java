import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = in.nextInt();

        int soma = 0;
        //for
        for (int i = 1; i <= numero; i++) {
            soma += i;
        }
        System.out.println(soma);
        soma = 0;
        //while
        while (numero > 0) {
            soma += numero;
            numero--;
        }
        System.out.println(soma);
    }
}
