import java.util.Scanner;

public class Exercicios1705 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        exe10();
    }

    public static void exe01() {
        /*Write a program that prints the length of a given string.
          Print if the string is empty
          Print the same string with all its letters changed to upper case
          Print the same string with all its letters changes to lower case*/
        System.out.println("Digite algo");
        String algo = in.nextLine();
        System.out.println("Length: "+algo.length());
        System.out.println("Empty: "+algo.isEmpty());
        System.out.println("Uppercase: "+algo.toUpperCase());
        System.out.println("Lowercase: "+algo.toLowerCase());
    }

    public static void exe02() {
        /*Write a program that reads two strings from the input and checks
        if they are equal or only equal with case ignored.*/
        System.out.println("Digite alguma coisa: ");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite alguma coisa (de novo): ");
        String algumaOutraCoisa = in.nextLine();
        if (algumaCoisa.equals(algumaOutraCoisa)) {
            System.out.println("São exatamente iguais");
        } else if (algumaCoisa.equalsIgnoreCase(algumaOutraCoisa)) {
            System.out.println("São iguais independente de case");
        } else {
            System.out.println("São diferentes");
        }
    }

    public static void exe03() {
        /*Write a program that reads two strings from the user and
        outputs if one is a part of the other.*/
        System.out.println("Digite alguma coisa: ");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite alguma coisa (de novo): ");
        String algumaOutraCoisa = in.nextLine();
        if (algumaCoisa.contains(algumaOutraCoisa)) {
            System.out.println(algumaOutraCoisa + " faz parte de "+ algumaCoisa);
        } else if(algumaOutraCoisa.contains(algumaCoisa)) {
            System.out.println(algumaCoisa + " faz parte de "+ algumaOutraCoisa);
        } else {
            System.out.println("Nenhuma string faz parte da outra");
        }
    }

    public static void exe04() {
        /*Write a program that reads two strings from the user and
        outputs if one word is the prefix (first part) of the other.*/
        System.out.println("Digite alguma coisa: ");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite alguma coisa (de novo): ");
        String algumaOutraCoisa = in.nextLine();
        if (algumaCoisa.startsWith(algumaOutraCoisa)) {
            System.out.println(algumaOutraCoisa + " é prefixo de " + algumaCoisa);
        } else if (algumaOutraCoisa.startsWith(algumaCoisa)) {
            System.out.println(algumaCoisa + " é prefixo de " + algumaOutraCoisa);
        } else {
            System.out.println("As string não são prefixo uma da outra");
        }
    }

    public static void exe05() {
        /*Write a program that reads two strings from the user and
        outputs if one word is the suffix (last part) of the other.*/
        System.out.println("Digite alguma coisa: ");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite alguma coisa (de novo): ");
        String algumaOutraCoisa = in.nextLine();
        if (algumaCoisa.endsWith(algumaOutraCoisa)) {
            System.out.println(algumaOutraCoisa + " é sufixo de " + algumaCoisa);
        } else if (algumaOutraCoisa.endsWith(algumaCoisa)) {
            System.out.println(algumaCoisa + " é sufixo de " + algumaOutraCoisa);
        } else {
            System.out.println("As string não são sufixo uma da outra");
        }
    }

    public static void exe06() {
        /*Write a program that prints the index and the character
        for a given word.*/
        System.out.println("Digite alguma coisa: ");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite alguma coisa (de novo): ");
        String algumaOutraCoisa = in.nextLine();
        int pos = algumaCoisa.indexOf(algumaOutraCoisa);
        System.out.println("A posição de " + algumaOutraCoisa + " em "
                + algumaCoisa + " é " + pos);
    }

    public static void exe07() {
        /*Use the replace method to decipher this string
        lala#lwve#-rwgra22lalang!#<3
            The code is:

            | Code |    Letter   |
            | w	   | o           |
            | #	   | ` ` (space) |
            | 2	   | m           |
            | lala | i           |
            | -	   | p           |*/
        String cyphered = "lala#lwve#-rwgra22lalang!#<3";
        String decyphered = cyphered.replace("w", "o");
        decyphered = decyphered.replace("#", " ");
        decyphered = decyphered.replace("2", "m");
        decyphered = decyphered.replace("lala", "i");
        decyphered = decyphered.replace("-", "p");
        System.out.println(decyphered);
    }

    public static void exe08() {
        /*Write a program that reads a set of integers,
        and then prints the sum of the even and odd integers.*/
        System.out.println("Informe a quantidade de números: ");
        int nums = in.nextInt();
        int[] numeros = new int[nums];
        for (int i = 0; i < nums; i++) {
            System.out.println("Informe um  número: ");
            numeros[i] = in.nextInt();
        }
        int somaPar = 0, somaImpar = 0;
        for(int valor : numeros) {
            if (valor % 2 == 0) {
                somaPar += valor;
            } else {
                somaImpar += valor;
            }
        }
        System.out.println("Soma dos valores pares: "+somaPar);
        System.out.println("Soma dos valores ímpares: "+somaImpar);
    }

    public static void exe09() {
        /*1- Let the user choose how many words they want to input
          2- Read that many words
          3- Let the user choose a number bigger than 0
          4- Remove all words from the array that are shorter than the given
          number*/
        System.out.println("Informe a quantidade de palavras: ");
        int nums = in.nextInt();
        String[] palavras = new String[nums];
        in.nextLine();
        for (int i = 0; i < nums; i++) {
            System.out.println("Informe uma palavra: ");
            palavras[i] = in.nextLine();
        }
        System.out.println("informe um número > 0: ");
        int numeroCorte = in.nextInt();
        for (int i = 0; i < nums; i++) {
            if (palavras[i].length() < numeroCorte) {
                palavras[i] = null;
            }
        }
        for (String palavra : palavras) {
            if (palavra != null) {
                System.out.println(palavra);
            }
        }
    }

    public static void exe10() {
        /*Take two integer lists as input and return a new list with
        all values of the first list that are not in the second list*/
        System.out.println("Informe a quantidade de numeros da primeira lista: ");
        int nums = in.nextInt();
        int[] numeros1 = new int[nums];
        for (int i = 0; i < nums; i++) {
            System.out.println("Informe um número: ");
            numeros1[i] = in.nextInt();
        }
        System.out.println("Informe a quantidade de numeros da segunda lista: ");
        int nums2 = in.nextInt();
        int[] numeros2 = new int[nums2];
        for (int i = 0; i < nums2; i++) {
            System.out.println("Informe um número: ");
            numeros2[i] = in.nextInt();
        }

        for(int valor1 : numeros1) {
            boolean achou = false;
            for (int valor2 : numeros2) {
                if(valor1 == valor2) {
                    achou = true;
                    break;
                }
            }
            if(!achou) {
                System.out.println(valor1);
            }
        }
    }



























    public static void exe11() {
        /*Write a program that allows a user to enter numbers.
        Save the numbers in an array.
          Ask the user now for two indices (positions) in the array.
          Swap the elements at these positions
          and print the resulting list. If the user enters a -1,
          stop and print the list.*/
    }



}

