package classes;

import java.util.ArrayList;

public class Onibus implements MeioTransporte{
    private ArrayList<AssentoOnibus> assentos = new ArrayList<>();
    private boolean leito;

    public boolean isLeito() {
        return leito;
    }

    public void setLeito(boolean leito) {
        this.leito = leito;
    }

    public ArrayList<AssentoOnibus> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoOnibus> assentos) {
        this.assentos = assentos;
    }

    public Onibus(int linhasCadeiras) {
        for(int i = 1; i <= 4*linhasCadeiras; i++) {
            AssentoOnibus a = new AssentoOnibus();
            if (i < 10) {
                a.setLugar("0"+i);
            } else {
                a.setLugar(String.valueOf(i));
            }
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
        for (int i = 1; i <= this.assentos.size(); i++) {
            AssentoOnibus a = this.assentos.get(i-1);
            if (a.isOcupado()) {
                System.out.print("[XX]");
            } else {
                System.out.printf("[%s]", a.getLugar());
            }
            System.out.print(" ");
            if (i % 2 == 0 && i % 4 != 0) {
                System.out.print("||");
            }
            System.out.print(" ");
            if (i % 4 == 0) {
                System.out.println();
            }
        }
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
