package classes;

import java.util.ArrayList;

public class Aviao implements MeioTransporte{
    private ArrayList<AssentoVoo> assentos = new ArrayList<>();

    public ArrayList<AssentoVoo> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoVoo> assentos) {
        this.assentos = assentos;
    }

    @Override
    public boolean verificaOcupacao(String assento) {
        return false;
    }

    @Override
    public int quantidadeLivre() {
        return 0;
    }

    @Override
    public void mostrarAssentos() {

    }

    @Override
    public Assento getAssento(String assento) {
        return null;
    }
}
