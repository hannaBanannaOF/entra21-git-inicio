package classes.lanches;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Lanche extends Produto {
    private ArrayList<String> ingredientes = new ArrayList<>();

    public void adicionarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public abstract void mostrarDetalhesComanda();

    public abstract void montarDetalhesLanche(Scanner in);

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }
}
