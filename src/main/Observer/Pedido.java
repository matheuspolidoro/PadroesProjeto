package main.Observer;

import java.util.Observable;

public class Pedido extends Observable {
    private String nome;
    private String status;

    public Pedido() {
    }

    public Pedido(String nome, String status) {
        this.nome = nome;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        setChanged();
        notifyObservers();
        this.status = status;
    }
}
