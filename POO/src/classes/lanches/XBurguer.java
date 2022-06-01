package classes.lanches;




public class XBurguer extends Sanduiche{

    public boolean aberto;

    public XBurguer() {
        this.adicionarIngrediente("Hamburguer");
        this.adicionarIngrediente("Queijunto");
        this.adicionarIngrediente("Preijo");
        this.adicionarIngrediente("Pão");
        this.tipo = "XBurguer";
    }

    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.aberto) {
            System.out.println("-- LANCHE ABERTO --");
        }
    }

}
