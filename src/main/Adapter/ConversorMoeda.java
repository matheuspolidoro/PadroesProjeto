package main.Adapter;

public class ConversorMoeda extends MoedaReal {
    private IMoeda moeda;

    public ConversorMoeda(IMoeda moedaPontos) {
        this.moeda = moedaPontos;
    }

    public Double recuperarPontosEmReal() {
        this.setValor(this.moeda.getValor() * 0.5);
        return this.getValor();
    }
}
