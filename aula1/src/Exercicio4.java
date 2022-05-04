import java.util.Scanner;

public class Exercicio4 {
    // repetir até o usuário informar 0
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);
        System.out.println("Qual tabuada deseja saber?");
        int valor = batata.nextInt();
        while (valor != 0) {
            for (int potat = 0; potat <= 10; potat++) {
                System.out.println(potat*valor);
            }
            System.out.println("Qual tabuada deseja saber?");
            valor = batata.nextInt();
        }

    }
}
