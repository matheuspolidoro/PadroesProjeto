package main;

import main.Adapter.ConversorMoeda;
import main.Adapter.MoedaPontos;
import main.Builder.Endereco;
import main.Builder.EnderecoBuilder;
import main.ChainOfResponsability.AtendenteMotoboy;
import main.ChainOfResponsability.LojaAtendente;
import main.ChainOfResponsability.SuporteAtendente;
import main.Composite.ComboProdutoLoja;
import main.Facade.Carrinho;
import main.Factory.Loja;
import main.Factory.LojaFactory;
import main.Flyweight.CategoriaProdutoFactory;
import main.Iterator.Produto;
import main.Iterator.ProdutoIterator;
import main.Iterator.ProdutoLoja;
 import main.Observer.Pedido;
import main.Singleton.Usuario;
import main.State.Cliente;
import main.Visitor.ComprovantePedido;

import java.util.Iterator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // - PADRÃO SINGLETON
        // - Instância de usuário logado
        Usuario user = Usuario.getInstance();
        Usuario.getInstance().cadastrarUsuario("Usuário Teste","1234","test@test.com");

        // - PADRÃO BUILDER
        // - Input de endereço de usuário
        EnderecoBuilder enderecoBuilder = new EnderecoBuilder();
        Endereco endereco = enderecoBuilder
                .setLogradouro("Endereco 1")
                .setCep("36010000")
                .setNumero("8")
                .build();

        // - PADRÃO ADAPTER
        // - Convertendo pontos acumulados por dinheiro
        MoedaPontos moedaPontos = new MoedaPontos();
        moedaPontos.setValor(100.0);

        ConversorMoeda conversorMoeda = new ConversorMoeda(moedaPontos);
        System.out.println("Moeda em real: " + conversorMoeda.recuperarPontosEmReal());

        // - PADRÃO FLYWEIGHT
        // - o registro de produtos na loja evita que
        // - haja instâncias repetidas de categoria no sistema

        Loja loja = new Loja("Loja", "Armarinho do bairro", 5.0, "111101", "srcImagem");

        ProdutoLoja produto1Loja = new ProdutoLoja("Produto 1", "Acompanha os itens xpto", 10.90, 10.0);
        ProdutoLoja produto2Loja = new ProdutoLoja("Produto 2", "Maravilhosa combinação de x com y", 32.00, 10.0);
        ProdutoLoja produto3Loja = new ProdutoLoja("Produto 3", "Ingredientes: a, b, c e d", 1.0, 5.0);

        loja.addProduto(produto1Loja, "Pizza");
        loja.addProduto(produto2Loja, "Pizza");
        loja.addProduto(produto3Loja, "Sorvete");

        System.out.println("Lista de categorias: " + CategoriaProdutoFactory.getCategorias());

        // - PADRÃO COMPOSITE
        // - instanciando combo de produtos
        // - listando produtos do combo
        ComboProdutoLoja combo1Loja = new ComboProdutoLoja("Kit de produtos", "Kit com os produtos 1 e 2", 1.0, 10.0);
        combo1Loja.addProdutos(produto1Loja);
        combo1Loja.addProdutos(produto2Loja);

        System.out.println("Lista de produtos da loja: " + combo1Loja.getProdutos());

        // - PADRÃO OBSERVER
        Pedido pedido = new Pedido();
        Cliente cliente = new Cliente();

        cliente.addObserver(pedido);
        pedido.setStatus("Em transporte");

        // - PADRÃO FACTORY
        Loja restaurante = LojaFactory.obterRestaurante("Restaurante");
        Loja bar = LojaFactory.obterRestaurante("Bar");
        restaurante.setNome("Restaurante X");
        bar.setNome("Bar Y");
        System.out.println("Restaurante Factory: " + restaurante.getNome());
        System.out.println("Bar Factory: " + bar.getNome());

        // - PADRÃO MEMENTO
        // - instancia produtos no carrinho
        Produto produto1 = new Produto(produto1Loja, 3.0);
        Produto produto2 = new Produto(produto2Loja, 7.0);
        Produto produto3 = new Produto(produto3Loja, 5.0);

        Carrinho.getInstance().setProduto(produto1);
        Carrinho.getInstance().setProduto(produto2);
        System.out.println("Carrinho: " + Carrinho.getInstance().getProdutos().size() + " unidade(s)");
        System.out.println(Carrinho.getInstance().deleteProduto(0));
        System.out.println("Carrinho: " + Carrinho.getInstance().getProdutos().size() + " unidade(s)");

        Carrinho.getInstance().getHistoricoProdutos().restauraEstado(1);
        System.out.println("Remoção do produto " + Carrinho.getInstance().getHistoricoProdutos().getProduto().getProduto().getNome() + " desfeita");
        Carrinho.getInstance().setProduto(Carrinho.getInstance().getHistoricoProdutos().getProduto());

        // - PADRÃO ITERATOR
        // - retornando valor total até o momento
        ProdutoIterator produtoIterator = new ProdutoIterator(Carrinho.getInstance().getProdutos());
        Iterator<Produto> prod = produtoIterator.iterator();
        while (prod.hasNext()){
            Produto prodAtual = prod.next();
            System.out.println("Produto: " + prodAtual.getProduto().getNome() + " - Total: R$ " + prodAtual.getValorTotal());
        }

        // - PADRÃO CHAIN OF RESPONSABILITY
        // - Instanciando perfis de atendimento

        SuporteAtendente suporteAplicativo = new SuporteAtendente();
        LojaAtendente lojaAtendente = new LojaAtendente(suporteAplicativo);
        AtendenteMotoboy motoboy = new AtendenteMotoboy(lojaAtendente);

        System.out.println("Atendimento com: " + motoboy.deveAtenderOcorrencia("Denúncia"));

        // - PADRÃO FACADE

        // - PADRÃO VISITOR
        // - instancia uma forma de cliente do usuário na compra
        Cliente clienteUsuario = new Cliente();
        Motoboy motoboy1 = new Motoboy();
        motoboy1.setNome("João entregador");

        System.out.println(" ------ COMPROVANTE ------");
        ComprovantePedido comprovantePedido = new ComprovantePedido(clienteUsuario, loja, Carrinho.getInstance(), motoboy1);
        System.out.println(" --- FIM COMPROVANTE  ---");

        // - PADRÃO MEDIATOR

    }
}
