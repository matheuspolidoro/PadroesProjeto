package main.Visitor;

import main.Facade.Carrinho;
import main.Factory.Loja;
import main.Motoboy;
import main.State.Cliente;

public class Visitor implements IVisitor {
    @Override
    public String exibirMotoboy(Motoboy motoboy) {
        return "Motoboy: " + motoboy.getNome();
    }

    @Override
    public String exibirLoja(Loja loja) {
        return "Loja: " + loja.getNome();
    }

    @Override
    public String exibirCarrinho(Carrinho carrinho) {
        return "Quantidade de produtos: " + carrinho.getProdutos().size();
    }

    @Override
    public String exibirCliente(Cliente cliente) {
       return cliente.getEstado().getTipoEstado();
    }
}
