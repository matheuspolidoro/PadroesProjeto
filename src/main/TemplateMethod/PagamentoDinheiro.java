package main.TemplateMethod;

public class PagamentoDinheiro extends TipoPagamento {

    public PagamentoDinheiro(String nome) {
        super(nome);
    }

    @Override
    public String efetuarPagamento() {
        return "";
    }
}
