package main.Adapter;

public class MoedaPontos implements IMoeda{
    private double pontos;

    @Override
    public double getValor() {
        return this.pontos;
    }

    @Override
    public void setValor(Double valor) {
        this.pontos = valor;
    }
}
