package classes;

public enum EMenu {
    SAIR(0, "Sair"),
    ADICIONAR_ITEM(1, "Adicionar item a estante"),
    BUSCAR_ITEM(2, "Buscar item"),
    REMOVER_ITEM(3, "Remover item da estante"),
    MOSTRAR_ITENS(4, "Mostar itens na estante"),
    ORGANIZAR_ESTANTE(6, "Organizar estante");

    private int valorOpcao;
    private String descricao;
    EMenu(int valor, String descricao) {
        valorOpcao = valor;
        this.descricao = descricao;
    }

    public static EMenu getByValorOpcao(int escolha) {
        for (EMenu e : EMenu.values()) {
            if (e.getValorOpcao() == escolha) {
                return e;
            }
        }
        return null;
    }

    public int getValorOpcao() {
        return this.valorOpcao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
