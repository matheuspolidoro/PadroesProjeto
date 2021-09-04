package main.State;

import main.Visitor.Visitor;

import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {
    private ClienteEstado estado;
    private String ultimaNotificacao;

    public Cliente() {
        this.estado = ClienteEstadoPrimeiraCompra.getInstance();
    }

    public void setEstado(ClienteEstado estado) {
        this.estado = estado;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCliente(this);
    }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }

    public void setUltimaNotificacao(String ultimaNotificacao) {
        this.ultimaNotificacao = ultimaNotificacao;
    }

    public void addObserver(Observable pedido){
        pedido.addObserver(this);
    }

    @Override
    public void update(Observable pedido, Object arg) {
        System.out.println("Status do pedido alterado");
    }

    public ClienteEstado getEstado() {
        return estado;
    }
}
