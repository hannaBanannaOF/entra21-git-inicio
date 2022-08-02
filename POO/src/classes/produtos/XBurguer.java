package classes.produtos;

import classes.ConsoleHelper;

import java.util.Scanner;

public class XBurguer extends MistoQuente {
    private boolean aberto;
    public XBurguer() {
        this.adicionarIngrediente("Hamburguer");
        this.setTipo(ETipoProduto.XBURGUER);
    }

    public boolean isAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    @Override
    public void mostrarDetalhesComanda() {
        super.mostrarDetalhesComanda();
        if (this.isAberto()) {
            System.out.println("-- LANCHE ABERTO --");
        }
    }

    @Override
    public void montarDetalhesProduto(Scanner in) {
        super.montarDetalhesProduto(in);
        System.out.println();
        this.setAberto("S".equalsIgnoreCase(ConsoleHelper.returnYesNoValidOption("Lanche aberto? (S/N)", in)));
    }
}
