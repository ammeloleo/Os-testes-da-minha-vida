package Kierkegaard;

public class Kierkegaard {

    private static final String Falar = "Você, eu, ninguém vai bater tão duro como a vida, ROCKY BALBOA";

    public static String extrair(int n) {
        if (n < 0 || n > Falar.length()) throw new IllegalArgumentException();
        return Falar.substring(0, n);
    }

}
