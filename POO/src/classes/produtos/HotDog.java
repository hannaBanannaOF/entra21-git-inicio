package classes.produtos;

public class HotDog extends Complementable {

    public HotDog() {
        this.adicionarIngrediente("Pão");
        this.adicionarIngrediente("Salsicha");
        this.adicionarIngrediente("Purê de batata");
        this.adicionarIngrediente("Batata palha");
        this.adicionarIngrediente("Vinagrete");
        this.adicionarIngrediente("Queijo Cheddar");
        this.adicionarIngrediente("Milho");
        this.adicionarIngrediente("Ervilha");
        this.setTipo(ETipoProduto.HOTDOG);
    }
}
