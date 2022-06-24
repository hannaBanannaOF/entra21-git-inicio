package classes;

import java.util.ArrayList;

public class Onibus implements MeioTransporte{
    private ArrayList<AssentoOnibus> assentos = new ArrayList<>();

    public ArrayList<AssentoOnibus> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoOnibus> assentos) {
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
