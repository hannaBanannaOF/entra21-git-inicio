import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        exe04();
    }

    public static void exe01() {
        int varA = 10;
        int varB = 20;
        int varC = varA;
        varA = varB;
        varB = varC;
        System.out.println(varA);
        System.out.println(varB);
    }

    public static void exe02() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = in.nextInt();
        System.out.println(--valor);
    }

    public static void exe03() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a base: ");
        double base = in.nextDouble();
        System.out.print("Informe a altura: ");
        double altura = in.nextDouble();
        double area = base * altura;
        double per = base * 2 + altura * 2;
        System.out.printf("Área: %.2f\n", area);
        System.out.printf("Perímetro: %.2f", per);
    }

    public static void exe04() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe os anos vividos: ");
        int anos = in.nextInt();
        System.out.print("Informe os meses vividos: ");
        int meses = in.nextInt();
        System.out.print("Informe os dias vividos: ");
        int dias = in.nextInt();
        System.out.printf("Você viveu %d dias", (anos*365)+(meses*30)+dias);
    }






}
