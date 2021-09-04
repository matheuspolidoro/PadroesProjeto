package main.ChainOfResponsability;

public class AtendenteMotoboy extends ChatAtendente{
    public AtendenteMotoboy(ChatAtendente superior) {
        this.setCargo("Motoboy do pedido");
        this.setAreaAtuacao("Entrega");
        this.setAtendenteSuperior(superior);
    }


}
