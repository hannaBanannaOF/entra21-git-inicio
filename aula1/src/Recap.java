import java.util.Scanner;

public class Recap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isHealer = true;
        while(isHealer) {
            System.out.println("Informe a abreviação da Classe: ");
            String clazz = in.next();
            if (clazz.length() != 3) {
                System.err.println("Não é uma abreviação válida!");
            } else {
                switch (clazz.toUpperCase()) {
                    case "WHM", "SAG", "SCH", "ARC":
                        System.out.println("Healer!");
                        break;
                    case "PLD", "WAR", "DKN", "GNB":
                        System.out.println("Tank!");
                        break;
                    case "MNK", "DRG", "NJA", "SMR", "RPR", "BRD", "MCH",
                            "DNC", "BLM", "SMN", "RDM", "BEM":
                        System.out.println("DPS!");
                    break;
                    default:
                        System.err.println("Não é uma classe válida!");
                        isHealer = false;
                        break;
                }
            }
        }
    }

    public static void text2() {
        String var3 = "Did you know About the aclaimed MMO FFXIV?";
        int qtde = 0;
        for(int i = 0; i < var3.length(); i++) {
            if(var3.charAt(i) == 'a') {
                qtde++;
            }
        }
        System.out.println(qtde);
    }

    public static void text() {
        // inteiros
        int var1 = 10;
        // caractere único
        char var2 = 'a';
        // texto
        String var3 = "ABCDEFGHI    FFXIV";
        // valor lógico
        boolean var4 = true;
        // decimais, números quebrados
        double var5 = 5.6;

        // saída - mensagens ao usuário
        System.out.println(); // exibe mensagem e quebra a linha
        System.out.print(""); // exibe mensagem sem quebra de linha
        System.out.printf("%d %.2f, %s", 10, 4.67888, "texto"); // exibe mensagem formatada sem quebra de linha

        // entrada - entrada de usuário PELO CONSOLE
        Scanner in = new Scanner(System.in);
        in.next(); // espera o usuário digitar, pega tudo o que foi digitado
        in.nextInt(); // espera o usuário digitar, pega valores inteiros
        in.nextDouble(); // espera o usuário digitar, pega valores decimais

        //operações aritméticas
        var1 = 10 + 10; // soma
        var1 = 10 - 10; // subtração
        var1 = 10 / 10; // divisão
        var1 = 10 * 10; // multiplicação
        var1 = 10 % 10; // resto de divisão - módulo

        //operações relacionais - SEMPRE RETORNAM VALOR BOOLEANO
        var4 = 10 > 10; // maior que
        var4 = 10 >= 10; // maior ou igual
        var4 = 10 < 10; // menor que
        var4 = 10 <= 10; // menor ou igual
        var4 = 10 == 10; // igualdade
        var4 = 10 != 10; // diferença

        //operações lógicos - COMPARAÇÃO ENTRE VALORES BOOLEANOS
        var4 = true && false; // true E false - SÓ VERDADE QUANDO AMBAS AS ENTRADAS FOREM VERDADE
        var4 = true || false; // true OU false - SÓ FALSE QUANDO AMBAS AS ENTRADAS FOREM FALSO
        var4 = !true; // NÃO false

        // condicionais - estruturas de seleção
        // if -> Analisa uma condição e executar os determinados códigos
        if(var4) {
            // se a condição for verdade executa esse trecho de código
        } else {
            // senão executa esse
        }

        // if aninhado
        if(var1 <= 10) {
            // se a condição for verdade executa esse trecho de código
            if(var4) {

            }
        }

        // if encadeado
        if(var1 == 1) {
            // se a primeira condição for verdade executa esse trecho de código
        } else if(var1 == 2) {
            // senão se a segunda condição for verdade executa esse trecho de código
        } else if(var1 == 3) {

        } else if(var1 == 4) {
            // ODEIO O YANDEV
        } else {
            // senão executa esse
        }

        // switch espera um valor e compara esse valor com cada caso informado
        switch(var1) {
            case 1:
                System.out.println("um");break; // se não tiver break, o código continuará sendo executado linha a linha
            case 2:
                System.out.println("dois");break;
            case 3:
                System.out.println("três");break;
            case 4:
                System.out.println("quatro");break;
            case 5:
                System.out.println("cinco");break;
            // se o valor não for igual a nenuhm caso, o padrão é executado
            default:
                System.out.println("não sei");break;
        }

        // repetição
        // for - irá repetir um trecho de código por um determinado
        // número de vezes
        // enquanto a condição for verdade
        for (int i = 0; i < 10; i++) {
            //código repetido a cada iteração
            System.out.println(i);
        }

        // while - irá repetir um trecho de código por um número de vezes
        // desconhecido
        // enquanto a condição for verdade
        while(var1 != 0) {
            System.out.println("teste");
            var1 = in.nextInt(); // atualização da variável utilizada na
            // condição do while, caso esse valor não seja atualizado
            // irá gerar um loop infinito
        }

        // String - LISTA DE CHAR
        var3 = "Did you know about the aclaimed MMO FFXIV?";
        System.out.println(var3.length()); //length() retorna a quantidade total
                                            // de caracteres no texto

        System.out.println(var3.charAt(0)); // charAt() retorna o caractere
                                            // na posição x do texto

        System.out.println(var3.equals("teste")); // equals() realiza comparação
                                                    // entre Strings
        System.out.println(var3.toLowerCase()); // toLowerCase() converte todos
                                                    // os caracteres da string
                                                    // para minúsculo
        System.out.println(var3.toUpperCase()); // toUpperCase() converte todos
                                                    // os caracteres da string
                                                    // para maiúsculo
        System.out.println(var3.contains("FFXIV"));  // contains() checa se o texto
                                                        // informado contém
                                                        // a String do parâmetro
        System.out.println(var3.strip()); // strip() remove espaços do final e
                                            // do começo do texto
        String[] splitted = var3.split(" "); // split() irá quebrar o texto
                                                    // no delimitador informado e
                                                    // retornar uma lista dos textos adquiridos
        for(String word : splitted){
            System.out.println(word);
        }

        System.out.println(var3.substring(5, 8));
    }
}
