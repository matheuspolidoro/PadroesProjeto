package main.State;

public class ClienteEstadoComum implements ClienteEstado{
    private ClienteEstadoComum() {};
    private static ClienteEstadoComum instance = new ClienteEstadoComum();
    public static ClienteEstadoComum getInstance() {
        return instance;
    }


    @Override
    public String getTipoEstado() {
        return "Cliente comum";

    }

    @Override
    public String pagarPedido(Cliente cliente) {
        return "Pedido pago";
    }
}