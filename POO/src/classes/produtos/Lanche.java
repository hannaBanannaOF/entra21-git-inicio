package classes.produtos;

import java.util.ArrayList;

public abstract class Lanche extends Produto {
    private final ArrayList<String> ingredientes = new ArrayList<>();

    public void adicionarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    @Override
    public void mostrarDetalhesComanda() {
        System.out.println("-INGREDIENTES-");
        for (String ingrediente : this.getIngredientes()) {
            System.out.println(ingrediente);
        }
    }
}
