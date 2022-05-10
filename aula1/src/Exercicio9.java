import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tentativas = 3;
        while(tentativas > 0) {
            System.out.print("Informe seu PIN: ");
            int pin = in.nextInt();
            if (pin == 91352) {
                System.out.println("ACESSO LIBERADO!");
                break;
            }
            tentativas--;
            if(tentativas == 0) {
                System.out.println("ACESSO BLOQUEADO!");
            } else {
                System.out.println("PIN incorreto, tente novamente!");
            }
        }
        System.out.println("Yandev é um *****");
    }
}
