package test;

import main.Singleton.Usuario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    public UsuarioTest() {
    }

    @Test
    public void deveRetornarCadastroComErro() {
        Usuario.getInstance().setCadastrado(false);
        String expResult = "Erro no cadastro";
        String result = Usuario.getInstance().cadastrarUsuario("Igor","","igor@test.com" );
        assertEquals(expResult, result);
    }

    @Test
    public void deveRetornarCadastroComSucesso() {
        Usuario.getInstance();
        String expResult = "Cadastro com sucesso";
        String result = Usuario.getInstance().cadastrarUsuario("Igor","1234","igor@test.com");
        assertEquals(expResult, result);
    }

    @Test
    public void deveRetornarUsuarioJaCadastrado() {
        Usuario.getInstance().cadastrarUsuario("Igor","1234","igor@test.com");
        String expResult = "Usuário já cadastrado";
        String result = Usuario.getInstance().cadastrarUsuario("Igor","1234","igor@test.com");
        assertEquals(expResult, result);
    }

    @Test
    public void deveRetornarLoginComErro() {

        String expResult = "Erro no login";
        String result = Usuario.getInstance().loginUsuario("Igor","igor@test.com" );
        assertEquals(expResult, result);
    }

    @Test
    public void deveRetornarLoggadoComSucesso() {
        Usuario.getInstance()
                .setSenha("1234")
                .setEmail("igor@test.com");
        String expResult = "Login efetuado";
        String result = Usuario.getInstance().loginUsuario("1234","igor@test.com" );
        assertEquals(expResult, result);
    }

    @Test
    public void deveRetornarUsuarioJaLoggado() {
        Usuario.getInstance()
                .setLoggado(true);
        String expResult = "Usuário já loggado";
        String result = Usuario.getInstance().loginUsuario("Igor","igor@test.com" );
        assertEquals(expResult, result);
    }

    @Test
    public void deveRetornarLogoutComErro() {
        Usuario.getInstance().setCadastrado(true).setLoggado(false);
        String expResult = "Erro no logout";
        String result = Usuario.getInstance().logoutUsuario();
        assertEquals(expResult, result);
    }

    @Test
    public void deveRetornarLogoutComSucesso() {
        Usuario.getInstance().setCadastrado(true).setLoggado(true);
        String expResult = "Loggout efetuado";
        String result = Usuario.getInstance().logoutUsuario();
        assertEquals(expResult, result);
    }

}
