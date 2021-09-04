package main.Builder;

public class EnderecoBuilder {
    private Endereco endereco;

    public EnderecoBuilder() {
        endereco = new Endereco();
    }

    public Endereco build() {
        if (endereco.getLogradouro().equals("")) {
            throw new IllegalArgumentException("Endereço inválido");
        }
        if (endereco.getNumero().equals("")) {
            throw new IllegalArgumentException("Número inválido");
        }
        if (endereco.getCep().equals("")) {
            throw new IllegalArgumentException("CEP inválido");
        }
        return endereco;
    }

    public EnderecoBuilder endereco(String logradouro) {
        this.endereco.setLogradouro(logradouro);
        return this;
    }

    public EnderecoBuilder setLogradouro(String logradouro) {
        this.endereco.setLogradouro(logradouro);
        return this;
    }

    public EnderecoBuilder setNumero(String numero) {
        this.endereco.setNumero(numero);
        return this;
    }

    public EnderecoBuilder setComplemento(String complemento) {
        this.endereco.setComplemento(complemento);
        return this;
    }

    public EnderecoBuilder setBairro(String bairro) {
        this.endereco.setBairro(bairro);
        return this;
    }

    public EnderecoBuilder setCidade(String cidade) {
        this.endereco.setCidade(cidade);
        return this;
    }

    public EnderecoBuilder setPais(String pais) {
        this.endereco.setPais(pais);
        return this;
    }

    public EnderecoBuilder setCep(String cep) {
        this.endereco.setCep(cep);
        return this;
    }
}
