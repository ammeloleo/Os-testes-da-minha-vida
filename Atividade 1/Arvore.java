package arvoreNatal;

public class Arvore {

    public static String construindoArvore(int a) {
        if (a % 2 == 0) throw new IllegalArgumentException("Esse numero nao fica muito legal);
        StringBuilder sb = new StringBuilder();
        for (int i = a; i >= 1; i -= 2) sb.append("*".repeat(i)).append("\n");
        sb.append("***\n*\n\n");
        return sb.toString();
    }
}
	


