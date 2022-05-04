import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantas palavras deseja informar?");
        int  qtdePal = in.nextInt();
        String[] palavras = new String[qtdePal];
        for (int i = 0; i < qtdePal; i++) {
            System.out.print("Informe a palavra: ");
            palavras[i] = in.next();
        }
        String palavraFinal = "";
        for (int i = 0; i < palavras.length; i++) {
            if (i == 0) {
                palavraFinal += palavras[i];
            } else {
                palavraFinal += ", "+palavras[i];
            }
        }
        System.out.println(palavraFinal);
    }
}
