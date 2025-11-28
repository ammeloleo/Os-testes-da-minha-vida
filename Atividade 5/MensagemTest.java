package Mensagem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MensagemTest {

    @Test
    void testeSimple() {
        assertEquals(2, Mensagem.contadorLinha(5, "123456789"));
    }
}
}
