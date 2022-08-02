package classes.produtos;

import java.util.Scanner;

public abstract class Produto {

    private double valor;

    private ETipoProduto tipo;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ETipoProduto getTipo() {
        return tipo;
    }

    public void setTipo(ETipoProduto tipo) {
        this.tipo = tipo;
    }

    public void mostrarDetalhesComanda() {
        System.out.println("====" + this.getTipo() + "====");
    }

    public abstract void montarDetalhesProduto(Scanner in);
}
