import java.util.Random;
import java.util.Scanner;

public class Exercicios1605 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        exe04();
    }

    public static void exe01() {
        /*Write a program that prompts the user to input an integer and then
        outputs the number with the digits reversed.
        For example, if the input is 12345, the output should be 54321.*/
        System.out.print("Informe um número: ");
        String numero = String.valueOf(in.nextInt());
        String inverso = "";
        for(int i = numero.length()-1; i >= 0; i--){
            inverso = String.valueOf(numero.charAt(i));
            System.out.print(numero.charAt(i));
        }
        System.out.println(inverso);
    }

    public static void exe02() {
        /*Write a program to enter the numbers till the user wants
        and at the end the program should display the largest and
        smallest number entered.*/
        int maior = 0, menor = 0;
        int parada = -1;
        boolean primeiro = true;
        while(true) {
            System.out.print("Informe um número (0 para sair): ");
            parada = in.nextInt();
            if(parada == 0) {
                break;
            }
            if(primeiro) {
                menor = parada;
                maior = parada;
                primeiro = false;
            } else {
                if (parada > maior) {
                    maior = parada;
                }
                if (parada < menor) {
                    menor = parada;
                }
            }
        }
        System.out.println("Menor valor informado: "+menor);
        System.out.println("maior valor informado: "+maior);
    }

    public static void exe03() {
        /*Write a program that generates a random number and asks
        the user to guess what the number is. If the user's guess is higher
        than the random number, the program should display "Too high, try again."
        If the user's guess is lower than the random number,
        the program should display "Too low, try again."
        The program should use a loop that repeats until the user correctly
        guesses the random number.*/
        Random r = new Random();
        int randomico = r.nextInt(101);
        int chutes = 0;
        while (true) {
            System.out.println("Informe um número: ");
            int valorInformado = in.nextInt();
            chutes++;
            if (valorInformado == randomico){
                System.out.println("ACERTOU MIZERAVI");
                break;
            } else if (valorInformado > randomico) {
                System.out.println("Chutou muito alto, tente de novo!");
            } else {
                System.out.println("Chutou muito baixo, tente de novo!");
            }
        }
        System.out.println("Você tentou "+chutes+" vezes");
    }

    public static void exe04() {
        /*Write a program to print following :
        i)**********     ii)*        iii)   *
          **********        **             **
          **********        ***           ***
          **********        ****         ****
                            *****       *****

        iv)    *        v)    1      vi)    1
              ***            222           212
             *****          33333         32123
            *******        4444444       4321234
           *********      555555555     543212345*/
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i+j < 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i+j < 4 || j-i > 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i+j < 4 || j-i > 4) {
                    System.out.print(" ");
                } else {
                    System.out.print(i+1);
                }
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i+j < 4 || j-i > 4) {
                    System.out.print(" ");
                } else if(j > 4) {
                    System.out.print(Math.abs(j-3));
                } else {
                    System.out.print(Math.abs(j-5));
                }
            }
            System.out.println("");
        }
    }
}
