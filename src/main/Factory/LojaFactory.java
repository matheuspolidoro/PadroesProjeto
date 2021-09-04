package main.Factory;

public class LojaFactory {
    public static Loja obterRestaurante(String loja) {
        Restaurante a = new Restaurante();

        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("main.Factory."+loja);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Loja inexistente + " + ex.getMessage());
        }
        if (!(objeto instanceof Loja) ) {
            throw new IllegalArgumentException("Loja inválida");
        }
        return (Loja) objeto;
    }
}
