package classes;

import org.jetbrains.annotations.Nullable;

public enum EMenu implements IMenu{
    SAIR(0, "Sair"),
    ADICIONAR_ITEM(1, "Adicionar item a estante"),
    BUSCAR_ITEM(2, "Buscar item"),
    REMOVER_ITEM(3, "Remover item da estante"),
    MOSTRAR_ITENS(4, "Mostar itens na estante"),
    ADICIONAR_ESTANTE(5, "Adicionar estante");
    private int valorOpcao;
    private String descricao;
    EMenu(int valor, String descricao) {
        valorOpcao = valor;
        this.descricao = descricao;
    }

    /**
     * Retorna uma opção de menu de acordo com o que o vier no parâmetro
     * @param escolha = Inteiro referente ao valor da opção do menu
     * @return A opção de menu escolhida ou null
     */
    public static @Nullable EMenu getByValorOpcao(int escolha) {
        for (EMenu e : EMenu.values()) {
            if (e.getValorOpcao() == escolha) {
                return e;
            }
        }
        throw new RuntimeException();
    }

    public int getValorOpcao() {
        return this.valorOpcao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
