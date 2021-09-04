package main.Composite;
 import main.Iterator.ProdutoLoja;

import java.util.ArrayList;
import java.util.List;

public class ComboProdutoLoja extends ProdutoLoja {
    private List<ProdutoLoja> produtos;

    public ComboProdutoLoja(String nome, String descricao, Double valorUnitario, Double quantidadeEstoque ) {
        super(nome, descricao,valorUnitario, quantidadeEstoque );
        this.produtos = new ArrayList<ProdutoLoja>();
    }

    public void addProdutos(ProdutoLoja produtos) {
        this.produtos.add(produtos);
    }

    public String getProdutos() {
        String saida = "";
        saida = "Produto: " + this.getDescricao() + "\n";
        for (ProdutoLoja produto : produtos) {
            saida += produto.getNome();
        }
        return saida;
    }
}
