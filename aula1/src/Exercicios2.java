import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {
        exe09();
    }

    public static void exe01() {
        // Entrada
        Scanner in = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int valor = in.nextInt();

        // Processamento
        if (valor > 10) {
            // Saída
            System.out.println("É maior que 10!");
        } else {
            // Saída
            System.out.println("Não é maior que 10!");
        }
    }

    public static void exe02() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int valor = in.nextInt();

        if (valor >= 0) {
            System.out.println("Valor positivo!");
        } else {
            System.out.println("Valor negativo!");
        }
    }

    public static void exe03() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o número de maças compradas: ");
        int valor = in.nextInt();
        if (valor < 12) {
            System.out.printf("Valor da compra: R$%.2f", valor*1.3);
        } else {
            System.out.printf("Valor da compra: R$%.2f", valor*1.0);
        }
    }

    public static void exe04() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o ano que você nasceu: ");
        int anoNasc = in.nextInt();
        System.out.print("Informe o ano atual: ");
        int anoAtual = in.nextInt();
        if ((anoAtual-anoNasc) < 16) {
            System.out.println("Não pode votar!");
        } else {
            System.out.println("Pode votar!");
        }
    }

    public static void exe05() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        int valor1 = in.nextInt();
        System.out.print("Informe o segundo valor: ");
        int valor2 = in.nextInt();

        /*System.out.println(Math.max(valor1, valor2));*/

        if (valor1 > valor2) {
            System.out.println(valor1);
        } else {
            System.out.println(valor2);
        }
    }

    public static void exe06() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        int valor1 = in.nextInt();
        System.out.print("Informe o segundo valor: ");
        int valor2 = in.nextInt();

        if (valor1 > valor2) {
            System.out.printf("%d, %d", valor2, valor1);
        } else {
            System.out.printf("%d, %d", valor1, valor2);
        }
    }

    public static void exe07() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a hora de início do jogo: ");
        int horaIni = in.nextInt();
        System.out.print("Informe a hora de fim do jogo: ");
        int horaFim = in.nextInt();

        if (horaIni > horaFim) {
            System.out.printf("Duração do jogo: %d", 24 - (horaIni - horaFim));
        } else {
            System.out.printf("Duração do jogo: %d", horaFim-horaIni);
        }
    }

    public static void exe08() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = in.nextInt();
        System.out.print("Informe o valor por hora do funcionário: ");
        double valorHora = in.nextDouble();

        double salario;
        if (horasTrabalhadas > 160) {
            salario = 160*valorHora+((horasTrabalhadas-160)*
                    (valorHora+valorHora/2));
        } else {
            salario = horasTrabalhadas*valorHora;
        }
        System.out.printf("Salário: %.2f", salario);
    }

    public static void exe09() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o seu nome: ");
        String nome = in.next();
        System.out.print("Informe a sua altura: ");
        double altura = in.nextDouble();
        System.out.print("Informe seu sexo (M/F)");
        String sexo = in.next();

        double peso;
        if (sexo.equals("M")) {
            peso = (72.7 * altura) - 58;
        } else {
            peso = (62.1 * altura) - 44.7;
        }
        System.out.printf("Peso ideal: %.2f", peso);
    }
}
