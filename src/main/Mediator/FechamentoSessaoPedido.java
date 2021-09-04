package main.Mediator;

import main.Singleton.Usuario;

public class FechamentoSessaoPedido {
    private static FechamentoSessaoPedido instancia = new FechamentoSessaoPedido();

    private FechamentoSessaoPedido() {}

    public static FechamentoSessaoPedido getInstance() {
        return instancia;
    }

    public String receberConfirmacaoEntrega(String mensagem) {
        return Usuario.getInstance().receberAlerta(mensagem);
    }

}
