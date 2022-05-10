import java.util.Scanner;

public class Exercico8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int fatorial = in.nextInt();
        int valorFinal = 1;
        if(fatorial == 0) {
            valorFinal = 0;
        } else {
            for (int i = fatorial; i > 0; i--) {
                valorFinal *= i;
            }
        }
        System.out.println("Fatorial de " + fatorial + " é " + valorFinal);
    }
}
