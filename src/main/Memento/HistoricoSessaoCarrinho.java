package main.Memento;

import main.Iterator.Produto;

import java.util.ArrayList;
import java.util.List;

public class HistoricoSessaoCarrinho {
    private Produto produto;
    private List<Produto> memento = new ArrayList<Produto>();

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.produto = this.memento.get(indice);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.memento.add(this.produto);
        this.produto = produto;
    }
}
