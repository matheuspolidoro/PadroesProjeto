package main.ChainOfResponsability;

import java.util.ArrayList;

public abstract class ChatAtendente {
    private String cargo;
    private ArrayList<String> areaAtuacao = new ArrayList<>();
    private ChatAtendente atendenteSuperior;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public ArrayList<String> getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao.add(areaAtuacao);
    }

    public ChatAtendente getAtendenteSuperior() {
        return atendenteSuperior;
    }

    public void setAtendenteSuperior(ChatAtendente atendenteSuperior) {
        this.atendenteSuperior = atendenteSuperior;
    }

    public String deveAtenderOcorrencia(String chamado) {
        if(this.areaAtuacao.contains(chamado)){
            return "Chat iniciado com " + this.cargo;
        }else{
            if (atendenteSuperior != null) {
                return atendenteSuperior.deveAtenderOcorrencia(chamado);
            }
            else
            {
                return "Sem atendimento no momento. Ligue para 0800";
            }
        }
    }

}
