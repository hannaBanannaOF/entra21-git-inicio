package classes.guardados;

import classes.itens.Item;

public class Estante {
    private int capMaxima;
    private Item[] itens;

    public Estante(int capMaxima) {
        setCapMaxima(capMaxima);
        setItens(new Item[capMaxima]);
        //TODO
    }

    public boolean estanteCheia() {
        //TODO
        return false;
    }

    public int quantidadeItens() {
        //TODO
        return 0;
    }

    public Item buscarItem(String titulo) {
        //TODO
        return null;
    }


    public boolean adicionarItem(Item item) {
        //TODO
        return false;
    }

    public Item removerItem(int posicao) {
        //TODO
        return null;
    }

    // GETTERS & SETTERS

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }
}
