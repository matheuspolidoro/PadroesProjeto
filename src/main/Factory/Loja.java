package main.Factory;

import main.Flyweight.CategoriaProduto;
import main.Flyweight.CategoriaProdutoFactory;
import main.Iterator.Produto;
import main.Iterator.ProdutoLoja;
import main.Visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String nome;
    private String descricao;
    private Double nota;
    private String cnpj;
    private String imagem;
    private List<ProdutoLoja> produtos = new ArrayList<>();

    public Loja(){}

    public Loja(String nome, String descricao, Double nota, String cnpj, String imagem) {
        this.nome = nome;
        this.descricao = descricao;
        this.nota = nota;
        this.cnpj = cnpj;
        this.imagem = imagem;
    }

    public List<ProdutoLoja> getProdutos() {
        return produtos;
    }

    public void addProduto(ProdutoLoja produto, String categoriaNome) {
        CategoriaProduto categoria = CategoriaProdutoFactory.getCategoria(categoriaNome);
        produto.setCategoria(categoria);
    }

    public List<String> obterCategorias() {
        List<String> saida = new ArrayList<String>();
        for (ProdutoLoja produto : this.produtos) {
            saida.add(produto.getNome());
        }
        return saida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirLoja(this);
    }
}
