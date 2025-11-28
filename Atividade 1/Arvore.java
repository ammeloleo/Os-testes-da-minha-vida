package arvoreNatal;

public class Arvore {

  
    public static String construindoArvore(int a) {
        if (a % 2 == 0) {
            throw new IllegalArgumentException("Esse número não fica muito legal, coloque um valor ímpar!");
        }
        StringBuilder arvore = new StringBuilder();
        for (int i = a; i >= 1; i -= 2) {
            arvore.append("*".repeat(i));
            arvore.append("\n");
        }

        arvore.append("***\n");
        arvore.append("*\n\n");

        return arvore.toString();
    }
}


