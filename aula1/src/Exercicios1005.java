import java.util.Random;
import java.util.Scanner;

public class Exercicios1005 {
    public static void main(String[] args) {
        exe02();
    }

    public static void exe01() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe seu nome completo: ");
        String nome = in.nextLine();
        String[] nomes = nome.split(" ");
        String out = "";
        for (String n : nomes) {
            out += n.charAt(0)+". ";
        }
        System.out.println(out.strip());
    }
    public static void exe02() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe uma palavra: ");
        String palavra = in.nextLine();

        String reverse = "";
        for(int i = palavra.length()-1; i >= 0; i--) {
            reverse += palavra.charAt(i);
        }

        reverse = new StringBuilder(palavra).reverse().toString();

        if (reverse.equals(palavra)) {
            System.out.println("Palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }
    }
}
