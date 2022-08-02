package classes.produtos;

public enum ESaborPizza {
    QUATRO_QUEIJOS("4 Queijos", 0),
    CALABRESA("Calabresa", 1),
    FRANGO_CATUPIRY("Frango c/ Catupiry", 2),
    MARGUERITA("Marguerita", 3),
    PORTUGUESA("Portuguesa", 4);

    private final String nomeApresentavel;
    private final int opcao;

    ESaborPizza(String nome, int opcao) {
        this.nomeApresentavel = nome;
        this.opcao = opcao;
    }

    public static ESaborPizza getByOpcaoMenu(int opcao) {
        for (ESaborPizza t : ESaborPizza.values()) {
            if (t.getOpcao() == opcao) {
                return t;
            }
        }
        return null;
    }

    public String getNomeApresentavel() {
        return nomeApresentavel;
    }

    public int getOpcao() {
        return opcao;
    }
}
