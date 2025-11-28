package arvoreNatal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteArvore {

    @Test
    void testar() {
        assertTrue(Arvore.construindoArvore(5).contains("***"));
    }
}
