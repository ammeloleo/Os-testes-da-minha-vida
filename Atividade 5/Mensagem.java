package Mensagem;

public class Mensagem {


    public static int contadorLinha(int limite, String msg) {
        int linhas = 0, i = 0;
        while (i < msg.length()) {
            if (msg.charAt(i) == ' ') i++;
            else {
                linhas++;
                i += limite;
            }
        }
        return linhas;
    }
}
}
