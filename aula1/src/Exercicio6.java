import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = in.nextLine();
        int contador = 0;
        for(int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == ' ') {
                contador++;
            }
        }
        System.out.println("A quantidade de espaços é: "+contador);
    }
}
