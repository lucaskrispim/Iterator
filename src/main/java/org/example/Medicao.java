package org.example;

public class Medicao {

    private String descricao;
    private boolean ativa;

    public Medicao(String descricao, boolean ativa) {
        this.setDescricao(descricao);
        this.setAtiva(ativa);
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição não pode ser nula ou vazia");
        }
        this.descricao = descricao;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
}
