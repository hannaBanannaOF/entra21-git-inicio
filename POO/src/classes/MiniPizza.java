package classes;

public class MiniPizza extends Lanche{

    public boolean bordaRecheada;
    public String saborBorda;
    public MiniPizza() {
        this.adicionarIngrediente("Massa");
        this.adicionarIngrediente("Massa de tomate");
        this.adicionarIngrediente("Mozzarella");
        this.adicionarIngrediente("Calabresa");
        this.tipo = "Mini Pizza";
    }

    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.bordaRecheada) {
            System.out.println("-- COM BORDA RECHEADA: "+this.saborBorda.toUpperCase()+" --");
        }
    }
    
}
