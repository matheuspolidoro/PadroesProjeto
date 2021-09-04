package main.ChainOfResponsability;

public class LojaAtendente extends ChatAtendente{
    public LojaAtendente(ChatAtendente superior) {
        this.setCargo("Loja do pedido");
        this.setAreaAtuacao("Pedido");
        this.setAtendenteSuperior(superior);
    }
}
