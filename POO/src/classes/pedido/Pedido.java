package classes.pedido;

import classes.produtos.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Pedido {

    private ArrayList<ItemPedido> itens = new ArrayList<>();
    private LocalDateTime dataPedido = LocalDateTime.now();

    public void setLanches(ArrayList<ItemPedido> itens) {
        this.itens = itens;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void imprimirComanda() {
        System.out.println("Data do pedido: "+dataPedido.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        for (ItemPedido l : this.getItensPedido()) {
            l.getProduto().mostrarDetalhesComanda();
            System.out.printf("Valor: R$%.2f\n", l.getProduto().getValor());
        }
        System.out.printf("Valor total do pedido: R$%.2f\n", this.calcularValorTotal());
        System.out.println("------------------------------------");
    }

    public double calcularValorTotal() {
        double vlrTotal = 0;
        for (ItemPedido l : this.getItensPedido()) {
            vlrTotal += l.getValorUnitario();
        }
        return vlrTotal;
    }

    public void adicionarItemPedido(ItemPedido item) {
        this.itens.add(item);
    }

    public ArrayList<ItemPedido> getItensPedido() {
        return this.itens;
    }
}
