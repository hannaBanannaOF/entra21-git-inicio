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

    public Aviao(int linhasCadeirasLuxo, int linhasCadeirasEconomicas) {
        String codigoAssentos = "ABCD";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < linhasCadeirasLuxo; j++) {
                AssentoVoo a = new AssentoVoo();
                a.setCodigo(String.valueOf(codigoAssentos.charAt(i))+j);
                a.setClasse(ClasseAssentoVoo.LUXO);
                assentos.add(a);
            }
        }
        codigoAssentos = "ABCDEF";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < linhasCadeirasEconomicas; j++) {
                AssentoVoo a = new AssentoVoo();
                a.setCodigo(String.valueOf(codigoAssentos.charAt(i))+j);
                a.setClasse(ClasseAssentoVoo.ECONOMICA);
                assentos.add(a);
            }
        }
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
        ArrayList<AssentoVoo> luxo = new ArrayList<>();
        ArrayList<AssentoVoo> economica = new ArrayList<>();
        for (AssentoVoo a : this.assentos) {
            if (ClasseAssentoVoo.LUXO.equals(a.getClasse())) {
                luxo.add(a);
            } else {
                economica.add(a);
            }
        }
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

    public Assento getAssento(String assento, ClasseAssentoVoo classe) {
        for (AssentoVoo a : this.assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento)
                && a.getClasse().equals(classe)) {
                return a;
            }
        }
        return null;
    }
}
