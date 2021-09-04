package main.Singleton;
//Singleton

public class Usuario {
    private Usuario() {};
    private static Usuario instance = new Usuario();
    public static Usuario getInstance() {
        return instance;
    }

    private Boolean cadastrado = false;
    private Boolean loggado = false;
    private String nome;
    private String email;
    private String senha;

    public String receberAlerta (String mensagem){
        return "Notificação de pedido finalizado entregue.";
    }

    public Boolean getCadastrado() {
        return cadastrado;
    }

    public Usuario setCadastrado(Boolean cadastrado) {
        this.cadastrado = cadastrado;
        return this;
    }

    public Boolean getLoggado() {
        return loggado;
    }

    public Usuario setLoggado(Boolean loggado) {
        this.loggado = loggado;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Usuario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Usuario setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public Usuario setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public String cadastrarUsuario(String nome, String senha, String email){
        if(this.getCadastrado()){
            return "Usuário já cadastrado";
        }

        if(!nome.isEmpty() && !senha.isEmpty() && !email.isEmpty() ){
            this.nome = nome;
            this.email = email;
            this.senha = senha;
            this.cadastrado = true;
            return "Cadastro com sucesso";
        }
        return "Erro no cadastro";
    }

    public String loginUsuario(String senha, String email){
        if(this.loggado) return "Usuário já loggado";
        if(this.cadastrado && this.email == email && this.senha == senha){
            this.loggado = true;
            return "Login efetuado";
        }
        return "Erro no login";
    }

    public String logoutUsuario(){
        if(this.cadastrado && this.loggado){
            this.loggado = false;
            this.nome="";
            this.email="";
            this.senha="";
            return "Loggout efetuado";
        }
        return "Erro no logout";
    }
}

