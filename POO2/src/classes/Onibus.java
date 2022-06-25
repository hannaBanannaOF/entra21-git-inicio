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

    public Onibus(int linhasCadeiras) {
        for(int i = 1; i <= 4*linhasCadeiras; i++) {
            AssentoOnibus a = new AssentoOnibus();
            a.setLugar(String.valueOf(i));
            assentos.add(a);
        }
    }

    @Override
    public boolean verificaOcupacao(String assento) {
        for (AssentoOnibus a : this.assentos) {
            if (a.getLugar().equalsIgnoreCase(assento)) {
                return a.isOcupado();
            }
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int assentosLivres = 0;
        for (AssentoOnibus a : this.assentos) {
            if (!a.isOcupado()) {
                assentosLivres++;
            }
        }
        return assentosLivres;
    }

    @Override
    public void mostrarAssentos() {

    }

    @Override
    public Assento getAssento(String assento) {
        for (AssentoOnibus a : this.assentos) {
            if (a.getLugar().equalsIgnoreCase(assento)) {
                return a;
            }
        }
        return null;
    }
}
