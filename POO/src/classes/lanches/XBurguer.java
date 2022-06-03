package classes.lanches;

public class XBurguer extends Sanduiche{
    private boolean aberto;

    public XBurguer() {
        this.adicionarIngrediente("Hamburguer");
        this.adicionarIngrediente("Queijunto");
        this.adicionarIngrediente("Preijo");
        this.adicionarIngrediente("Pão");
        this.setTipo("XBurguer");
    }

    public boolean isAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
}
