package main.Visitor;
import main.Facade.Carrinho;
import main.Factory.Loja;
import main.Motoboy;
import main.State.Cliente;

public interface IVisitor {
    String exibirMotoboy(Motoboy motoboy);
    String exibirLoja(Loja loja);
    String exibirCarrinho(Carrinho funcionario);
    String exibirCliente(Cliente funcionario);
}
