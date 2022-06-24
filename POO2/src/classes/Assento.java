package classes;

public abstract class Assento {

    private boolean ocupado;
    private double valor;

    public void ocupar() {
        this.setOcupado(true);
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
