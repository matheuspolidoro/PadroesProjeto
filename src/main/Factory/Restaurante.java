package main.Factory;

public class Restaurante extends Loja {
    public Restaurante(String nome, String descricao, Double nota, String cnpj, String imagem) {
        super(nome, descricao, nota, cnpj, imagem);
    }

    public Restaurante() {
        super();
    }
}
