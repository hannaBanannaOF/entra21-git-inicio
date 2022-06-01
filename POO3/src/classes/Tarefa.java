package classes;

import java.util.UUID;

public class Tarefa {
    private String uuid;
    private String nome;
    private String descricao;
    private boolean completa;
    private int ordem;

    public Tarefa() {
        this.setUuid(UUID.randomUUID().toString());
    }

    public void completar() {
        this.setCompleta(true);
    }

    // Getter & Setter

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCompleta() {
        return completa;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }
}
