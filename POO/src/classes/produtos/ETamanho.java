package classes.produtos;

public enum ETamanho {
    XS("XS - Broto", 0),
    SM("SM - Pequeno", 1),
    MD("MD - Médio", 2),
    LG("LG - Grande", 3),
    XL("XL - Família", 4);

    private final String nomeApresentavel;
    private final int opcao;

    ETamanho(String nome, int opcao) {
        this.nomeApresentavel = nome;
        this.opcao = opcao;
    }

    public static ETamanho getByOpcaoMenu(int opcao) {
        for (ETamanho t : ETamanho.values()) {
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
