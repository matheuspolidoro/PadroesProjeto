package main.Visitor;

import main.Facade.Carrinho;
import main.Factory.Loja;
import main.Motoboy;
import main.State.Cliente;

public class ComprovantePedido {
    public String comprovante;
    public Visitor visitor = new Visitor();

    public ComprovantePedido(Cliente cliente, Loja loja, Carrinho carrinho, Motoboy motoboy) {
        System.out.println(visitor.exibirCliente(cliente) + "\n" + visitor.exibirLoja(loja) + "\n" + visitor.exibirCarrinho(carrinho) + "\n" + visitor.exibirMotoboy(motoboy));
    }
}
