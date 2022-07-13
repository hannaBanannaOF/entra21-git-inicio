package classes.lanches;

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
    public void montarDetalhesLanche(Scanner in) {
        super.montarDetalhesLanche(in);
        System.out.println("Lanche aberto? (S/N)");
        String aberto = in.nextLine();
        this.setAberto(aberto.equalsIgnoreCase("S"));
    }
}
