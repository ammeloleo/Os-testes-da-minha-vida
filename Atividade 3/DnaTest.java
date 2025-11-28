package dna;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DnaTest {
    @Test
    void testResistente() {
        assertTrue(Dna.eResistente("ACGTACGT", "CGT"));
    }

    @Test
    void testNaoResistente() {
        assertFalse(Dna.eResistente("AAAA", "CG"));
    }
}
}
