package classes.lanches;

public abstract class Lanche {
    private String[] ingredientes = new String[10];
    private double valor;

    private String tipo;

    public void adicionarIngrediente(String ingrediente) {
        for (int i = 0; i < 10; i++) {
            if(this.ingredientes[i] == null) {
                this.ingredientes[i] = ingrediente;
                break;
            }
        }
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
