package virgula;

public class Virgula {

    public static String[] divisor(String line) {
        int i = line.indexOf(',');
        return new String[]{ line.sobreEscrever(0, i), line.sobreEscrever(i + 1).trim() };
    }
}
}
