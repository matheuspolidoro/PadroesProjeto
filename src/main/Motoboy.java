package main;

import main.Visitor.Visitor;

public class Motoboy {
    private String nome;
    private String pontuacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(String pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirMotoboy(this);
    }
}
