package classes.produtos;

import classes.ConsoleHelper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MiniPizza extends Lanche{
    private boolean bordaRecheada;
    private String saborBorda;
    private ESaborPizza sabor;
    public MiniPizza() {
        this.adicionarIngrediente("Massa");
        this.adicionarIngrediente("Massa de tomate");
        this.adicionarIngrediente("Mozzarella");
        this.setTipo(ETipoProduto.MINIPIZZA);
    }

    public void adicionarSaborEIngredientes(ESaborPizza sabor) {
        this.setSabor(sabor);
        switch (sabor) {
            case QUATRO_QUEIJOS -> {
                this.adicionarIngrediente("Cheddar");
                this.adicionarIngrediente("Catupiry");
                this.adicionarIngrediente("Provolone");
            }
            case CALABRESA -> this.adicionarIngrediente("Calabresa");
            case FRANGO_CATUPIRY -> {
                this.adicionarIngrediente("Frango");
                this.adicionarIngrediente("Catupiry");
            }
            case MARGUERITA -> {
                this.adicionarIngrediente("Tomate");
                this.adicionarIngrediente("Majericão");
            }
            case PORTUGUESA -> {
                this.adicionarIngrediente("Presunto");
                this.adicionarIngrediente("Cebola");
                this.adicionarIngrediente("Ovo");
            }
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

    public void setSabor(ESaborPizza sabor) {
        this.sabor = sabor;
    }

    public ESaborPizza getSabor() {
        return this.sabor;
    }

    @Override
    public void mostrarDetalhesComanda() {
        System.out.println("====" + this.getTipo() + " - " + this.getSabor() + "====");
        if (this.isBordaRecheada()) {
            System.out.println("-- COM BORDA RECHEADA: " + this.getSaborBorda().toUpperCase() + " --");
        }
        super.mostrarDetalhesComanda();
    }

    @Override
    public void montarDetalhesProduto(Scanner in) {
        while (true) {
            System.out.println("Sabor: ");
            for (ESaborPizza tam : ESaborPizza.values()) {
                System.out.printf("(%d) %s\n", tam.getOpcao(), tam.getNomeApresentavel());
            }
            try {
                ESaborPizza tam = ESaborPizza.getByOpcaoMenu(in.nextInt());
                if (tam == null) {
                    ConsoleHelper.showError("Selecione um sabor válido!");
                    continue;
                }
                this.adicionarSaborEIngredientes(tam);
                break;
            } catch (InputMismatchException e) {
                ConsoleHelper.showError("Selecione um sabor válido!");
            } finally {
                in.nextLine();
            }
        }
        System.out.println();
        this.setBordaRecheada("S".equalsIgnoreCase(ConsoleHelper.returnYesNoValidOption("Com borda recheada? (S/N)", in)));
        if (this.isBordaRecheada()) {
            System.out.println("Qual o sabor da borda?");
            this.setSaborBorda(in.nextLine());
        }
    }
}

