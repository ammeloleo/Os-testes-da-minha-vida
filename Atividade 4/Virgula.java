package virgula;

public class Virgula {

    public static String[] divisor(String line) {

        int posicaoVirgula = line.indexOf(',');

        String antes = line.substring(0, posicaoVirgula);
        String depois = line.substring(posicaoVirgula + 1).trim();

        return new String[]{ antes, depois };
    }
}
