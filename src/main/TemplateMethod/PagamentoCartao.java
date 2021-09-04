package main.TemplateMethod;

public class PagamentoCartao extends TipoPagamento {

    public PagamentoCartao(String nome) {
        super(nome);
    }

    @Override
    public String efetuarPagamento() {
        return "Pagamento autorizado pela operadora";
    }
}
