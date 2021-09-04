package main.Factory;

public class Bar extends Loja {
    public Bar(String nome, String descricao, Double nota, String cnpj, String imagem) {
        super(nome, descricao, nota, cnpj, imagem);
    }

    public Bar() {
        super();
    }
}
