package main.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CategoriaProdutoFactory {
    private static Map<String, CategoriaProduto> categorias = new HashMap<>();

    public static CategoriaProduto getCategoria(String nome) {
        CategoriaProduto categoriaProduto = categorias.get(nome);
        if (categoriaProduto == null) {
            categoriaProduto = new CategoriaProduto(nome);
            categorias.put(nome, categoriaProduto);
        }
        return categoriaProduto;
    }

    public static Map<String, CategoriaProduto> getCategorias() {
        return categorias;
    }

    public static int getTotalCategorias() {
        return categorias.size();
    }

}
