package main.Iterator;

public class Produto {
    private ProdutoLoja produto;
    private Double quantidade;
    private Double valorTotal;

    public Produto(ProdutoLoja produto, Double quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.setValorTotal();
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.setValorTotal();
        this.quantidade = quantidade;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal() {
        this.valorTotal = produto.getValorUnitario() * quantidade;
    }

    public ProdutoLoja getProduto() {
        return produto;
    }

}
