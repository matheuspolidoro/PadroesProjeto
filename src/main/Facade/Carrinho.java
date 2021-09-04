package main.Facade;


import main.Iterator.Produto;
import main.Memento.HistoricoSessaoCarrinho;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private Carrinho() {};
    private static Carrinho instance = new Carrinho();
    public static Carrinho getInstance() {
        return instance;
    }

    private List<Produto> produtos = new ArrayList<Produto>();
    private HistoricoSessaoCarrinho historicoProdutos = new HistoricoSessaoCarrinho();

    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public void setProduto(Produto produto) {
        this.historicoProdutos.setProduto(produto);
        this.produtos.add(produto);
    }

    public String deleteProduto(int index) {
        Produto produtoCopia = this.produtos.get(index);
        this.produtos.remove(index);
        return "Produto: " + produtoCopia.getProduto().getNome() + " retirado do carrinho";
    }

    public HistoricoSessaoCarrinho getHistoricoProdutos() {
        return historicoProdutos;
    }

}
