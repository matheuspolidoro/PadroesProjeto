package main.State;

public class ClienteEstadoPrimeiraCompra implements ClienteEstado{
    private ClienteEstadoPrimeiraCompra() {};
    private static ClienteEstadoPrimeiraCompra instance = new ClienteEstadoPrimeiraCompra();
    public static ClienteEstadoPrimeiraCompra getInstance() {
        return instance;
    }

    @Override
    public String pagarPedido(Cliente cliente) {
        return "Primeiro pedido pago com desconto de 10%";
    }

    @Override
    public String getTipoEstado() {
        return "Primeira compra";
    }
}
