package virgula;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VirgulaTest {

    @Test
    void testeDivisor() {
        String[] partes = divisor.split("Hello, Word");
        assertEquals("Hello", partes[0]);
        assertEquals("Word", partes[1]);
    }
}
}
