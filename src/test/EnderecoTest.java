package test;

import main.Builder.Endereco;
import main.Builder.EnderecoBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class EnderecoTest {

    @Test
    void deveRetornarExcecaoParaEnderecoSemNumero() {
        try {
            EnderecoBuilder enderecoBuilder = new EnderecoBuilder();
            Endereco endereco = enderecoBuilder
                    .setLogradouro("Endereco 1")
                    .setCep("36010000")
                    .setNumero("")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número inválido", e.getMessage());
        }
    }
}
