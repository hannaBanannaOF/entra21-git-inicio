package classes.pedido;

import classes.lanches.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Pedido {

    private ArrayList<Lanche> lanches = new ArrayList<>();
    private LocalDateTime dataPedido = LocalDateTime.now();

    public void setLanches(ArrayList<Lanche> lanches) {
        this.lanches = lanches;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void imprimirComanda() {
        System.out.println("Data do pedido: "+dataPedido.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        for (Lanche l : this.getLanches()) {
            l.mostrarDetalhesComanda();
            System.out.println("-INGREDIENTES-");
            for (String ingrediente : l.getIngredientes()) {
                System.out.println(ingrediente);
            }
            System.out.printf("Valor: R$%.2f\n", l.getValor());
        }
        System.out.printf("Valor total do pedido: R$%.2f\n", this.calcularValorTotal());
        System.out.println("------------------------------------");
    }

    public double calcularValorTotal() {
        double vlrTotal = 0;
        for (Lanche l : this.getLanches()) {
            vlrTotal += l.getValor();
        }
        return vlrTotal;
    }

    public void adicionarLanche(Lanche lanche) {
        this.lanches.add(lanche);
    }

    public ArrayList<Lanche> getLanches() {
        return this.lanches;
    }
}
