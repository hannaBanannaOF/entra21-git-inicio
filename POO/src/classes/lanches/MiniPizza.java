package classes.lanches;

import java.util.Scanner;

public class MiniPizza extends Lanche{

    private boolean bordaRecheada;
    private String saborBorda;
    private String sabor;
    public MiniPizza() {
        this.adicionarIngrediente("Massa");
        this.adicionarIngrediente("Massa de tomate");
        this.adicionarIngrediente("Mozzarella");
        this.setTipo("Mini Pizza");
    }

    public void adicionarSaborEIngredientes(String sabor) {
        this.setSabor(sabor);
        switch(sabor.toUpperCase()) {
            case "4 QUEIJOS":
                this.adicionarIngrediente("Cheddar");
                this.adicionarIngrediente("Catupiry");
                this.adicionarIngrediente("Provolone");
                break;
            case "CALABRESA":
                this.adicionarIngrediente("Calabresa");
                break;
            case "FRANGO C/ CATUPIRY":
                this.adicionarIngrediente("Frango");
                this.adicionarIngrediente("Catupiry");
                break;
            case "MARGUERITA":
                this.adicionarIngrediente("Tomate");
                this.adicionarIngrediente("Majericão");
                break;
            case "PORTUGUESA":
                this.adicionarIngrediente("Presunto");
                this.adicionarIngrediente("Cebola");
                this.adicionarIngrediente("Ovo");
                break;
        }
    }

    public void setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }

    public boolean isBordaRecheada() {
        return this.bordaRecheada;
    }

    public void setSaborBorda(String saborBorda) {
        this.saborBorda = saborBorda;
    }

    public String getSaborBorda() {
        return this.saborBorda;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getSabor() {
        return this.sabor;
    }

    @Override
    public void mostrarDetalhesComanda() {
        System.out.println("====" + this.getTipo() + " - " + this.getSabor() + "====");
        if (this.isBordaRecheada()) {
            System.out.println("-- COM BORDA RECHEADA: " + this.getSaborBorda().toUpperCase() + " --");
        }
    }

    @Override
    public void montarDetalhesLanche(Scanner in) {
        System.out.println("Escolha o sabor da pizza:");
        System.out.println("(1) - 4 Queijos");
        System.out.println("(2) - Calabresa");
        System.out.println("(3) - Frango c/ catupiry");
        System.out.println("(4) - Marguerita");
        System.out.println("(5) - Portuguesa");
        int sabor = in.nextInt();
        in.nextLine();
        switch (sabor) {
            case 1:
                this.adicionarSaborEIngredientes("4 queijos");
                break;
            case 2:
                this.adicionarSaborEIngredientes("calabresa");
                break;
            case 3:
                this.adicionarSaborEIngredientes("frango c/ catupiry");
                break;
            case 4:
                this.adicionarSaborEIngredientes("marguerita");
                break;
            case 5:
                this.adicionarSaborEIngredientes("portuguesa");
                break;
            default:
                System.err.println("Escolha um sabor válido");
        }
        System.out.println("Com borda recheada? (S/N)");
        String aberto = in.nextLine();
        this.setBordaRecheada(aberto.equalsIgnoreCase("S"));
        if (this.isBordaRecheada()) {
            System.out.println("Qual o sabor da borda?");
            this.setSaborBorda(in.nextLine());
        }
    }
}

