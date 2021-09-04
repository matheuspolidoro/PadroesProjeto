package main.TemplateMethod;

public abstract class TipoPagamento {
    private String nomeTipoPagamento;

    public TipoPagamento(String nome) {
        this.nomeTipoPagamento = nome;
    }

    public abstract String efetuarPagamento();


 }
