package cartas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carta> baralho = new ArrayList<>();
        for (Naipe n : Naipe.values()) {
            for (ValorCarta vc : ValorCarta.values()) {
                Carta c = new Carta();
                c.setValor(vc);
                c.setNaipe(n);
                baralho.add(c);
            }
        }
        for (Carta c : baralho) {
            System.out.println(c.getNaipe().getNaipe()+" "+c.getValor().getValor()+" "+c.getNaipe().getNaipe());
        }
    }
}
