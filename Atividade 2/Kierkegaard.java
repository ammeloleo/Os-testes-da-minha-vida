package Kierkegaard;

public class Kierkegaard {
    
    private static final String FALAR = "Você, eu, ninguém vai bater tão duro como a vida, ROCKY BALBOA";

    public static String extrair(int n) {
        
        if (n < 0 || n > FALAR.length()) {
            throw new IllegalArgumentException("Número inválido para extrair!");
        }

        return FALAR.substring(0, n);
    }
}
