package concessionaria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static HashMap<String, ArrayList<Carro>> carros = new HashMap<>();
    public static void main(String[] args) {
        boolean executa = true;
        while (executa) {
            System.out.println("// Concessionária //");
            System.out.println("1 - Ver catálogo");
            System.out.println("2 - Adicionar carro ao catálogo");
            System.out.println("3 - Vender");
            System.out.println("0 - Sair");
            int escolha = in.nextInt();
            in.nextLine();
            switch(escolha) {
                case 0: executa = false; break;
                case 1: mostrarListaCarros(); break;
                case 2: adicionarCarro(); break;
                case 3: venderCarro(); break;
                default: System.out.println("Selecione uma opção válida!\n"); break;
            }
        }
    }

    private static void venderCarro() {
        System.out.print("Informe a marca do carro: ");
        String marca = in.nextLine();
        if (!carros.containsKey(marca.toLowerCase())) {
            System.out.println("Não existem carros da marca '"+marca+"'!");
        } else {
            System.out.print("Informe o modelo do carro: ");
            String modelo = in.nextLine();
            ArrayList<Carro> carrosMarca = carros.get(marca.toLowerCase());
            boolean encontrado = false;
            for (int i = 0; i < carrosMarca.size(); i++) {
                Carro c = carrosMarca.get(i);
                if (c.getModelo().equalsIgnoreCase(modelo)) {
                    encontrado = true;
                    System.out.printf("Valor da venda: R$%.2f. Deseja efetuar venda (S/N)? ", c.getValor());
                    if (in.nextLine().equalsIgnoreCase("S")) {
                        System.out.printf("Carro %s da marca %s vendido por R$%.2f!\n", marca, c.getModelo(), c.getValor());
                        carrosMarca.remove(i);
                        if (carrosMarca.isEmpty()) {
                            carros.remove(marca.toLowerCase());
                        }
                    }
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Carro de modelo '"+modelo+"' não encontrado na marca '"+marca+"'!");
            }
        }
        System.out.println();
    }

    private static void adicionarCarro() {
        System.out.print("Informe a marca do carro: ");
        String marca = in.nextLine().toLowerCase();
        Carro c = new Carro();
        System.out.print("Informe o modelo do carro: ");
        c.setModelo(in.nextLine());
        System.out.print("Informe o valor de venda do carro: R$");
        c.setValor(in.nextDouble());
        in.nextLine();
        if (!carros.containsKey(marca)) {
            carros.put(marca, new ArrayList<>());
        }
        carros.get(marca).add(c);
        System.out.println("Carro adicionado ao catálogo!");
        System.out.println();
    }

    private static void mostrarListaCarros() {
        if (carros.isEmpty()) {
            System.out.println("Não existem carros cadastrados!");
        } else {
            System.out.println("** Catálogo **");
            for (String key : carros.keySet()) {
                System.out.println("--- " + key.toUpperCase() + " ---");
                for (Carro c : carros.get(key)) {
                    System.out.printf("%s: R$%.2f\n", c.getModelo(), c.getValor());
                }
            }
        }
        System.out.println();
    }
}
