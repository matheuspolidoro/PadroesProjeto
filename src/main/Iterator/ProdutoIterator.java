package main.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ProdutoIterator implements Iterable<Produto>{

    private List<Produto> produtosLista = new ArrayList<>();

    public ProdutoIterator(List<Produto> produtos) {
        this.produtosLista = produtos;
    }

    @Override
    public Iterator<Produto> iterator() {
        return produtosLista.iterator();
    }
}
