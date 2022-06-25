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
        for (AssentoVoo a : this.assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento)) {
                return a.isOcupado();
            }
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int livres = 0;
        for (AssentoVoo a : this.assentos) {
            if (!a.isOcupado()) {
                livres++;
            }
        }
        return livres;
    }

    @Override
    public void mostrarAssentos() {

    }

    @Override
    public Assento getAssento(String assento) {
        for (AssentoVoo a : this.assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento)) {
                return a;
            }
        }
        return null;
    }

    public Assento getAssento(String assento, String classe) {
        for (AssentoVoo a : this.assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento)
                && a.getClasse().equalsIgnoreCase(classe)) {
                return a;
            }
        }
        return null;
    }
}
