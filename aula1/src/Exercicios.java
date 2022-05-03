import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        exe10();
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

    public static void exe05() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o número de eleitores: ");
        int eleitores = in.nextInt();
        System.out.print("Informe o número de votos BRANCOS: ");
        int brancos = in.nextInt();
        System.out.print("Informe o número de votos NULOS: ");
        int nulos = in.nextInt();

        int validos = eleitores - brancos - nulos;
/*
        eleitores --- 100
        validos   ---  x

        x = (validos*100)/eleitores
        eleitores*x = validos*100
        10*x = 5*100
        10x = 500
        x = 500/10
        x = 50
*/

        double percentValidos = (validos*100.0)/eleitores;
        double percentBrancos = (brancos*100.0)/eleitores;
        double percentNulos = (nulos*100.0)/eleitores;

        System.out.println("Total de votos VÁLIDOS: "+validos);
        System.out.printf("%% de votos VÀLIDOS: %.2f%%\n", percentValidos);
        System.out.printf("%% de votos BRANCOS: %.2f%%\n", percentBrancos);
        System.out.printf("%% de votos NULOS: %.2f%%\n", percentNulos);
    }

    public static void exe06() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o salário atual do funcionário: R$");
        double salAtual = in.nextDouble();
        System.out.print("Informe o % de reajuste: ");
        double percentReajuste = in.nextDouble();

        /*
            salAtual --- 100
            ???????? --- percentReajuste

            percentReajuste*salAtual = 100x

        */

        double valorReajuste = (percentReajuste*salAtual) / 100;
        System.out.printf("Salário reajustado: R$%.2f", salAtual+valorReajuste);

    }

    public static void exe07() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o custo de fábrica do automóvel: ");
        double custoFabrica = in.nextDouble();

        double custoFinal = custoFabrica + ((custoFabrica*28)/100) + ((custoFabrica*45)/100);

        System.out.printf("Custo final: R$%.2f", custoFinal);
    }

    public static void exe08() {
        Scanner in = new Scanner(System.in);
        System.out.print("Salário fixo: ");
        double salFixo = in.nextDouble();
        System.out.print("Carros vendidos: ");
        int carrosVendidos = in.nextInt();
        System.out.println("Comissão fixa por carro vendido: ");
        double comFixa = in.nextDouble();
        System.out.println("Valor total das vendas: ");
        double valorVendas = in.nextDouble();

        double comFixaPorCarro = comFixa * carrosVendidos;
        double percentual = (valorVendas * 5)/100;
        double salFinal = salFixo + comFixaPorCarro + percentual;

        System.out.printf("Salário final: R$%.2f", salFinal);
    }

    public static void exe09() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a temperatura (F): ");
        double tempF = in.nextDouble();
        double tempC = ((tempF-32)*5)/9;
        System.out.printf("Temperatura em Celsius: %.2f", tempC);
    }

    public static void exe10() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a primeira nota: ");
        double nota1 = in.nextDouble();
        System.out.print("Informe a segunda nota: ");
        double nota2 = in.nextDouble();
        System.out.print("Informe a terceira nota: ");
        double nota3 = in.nextDouble();

        double media = ((nota1 * 2)+(nota2 * 3)+(nota3 * 5))/10;
        System.out.printf("Média final: %.2f", media);
    }
}
