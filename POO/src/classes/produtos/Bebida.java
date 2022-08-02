package classes.produtos;

import java.util.Scanner;

public class Bebida extends Produto {
    private boolean alcoolica;
    private String nome;

    public Bebida() {
        this.setTipo(ETipoProduto.BEBIDA);
    }

    public boolean isAlcoolica() {
        return alcoolica;
    }

    public void setAlcoolica(boolean alcoolica) {
        this.alcoolica = alcoolica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void montarDetalhesProduto(Scanner in) {

    }
}
