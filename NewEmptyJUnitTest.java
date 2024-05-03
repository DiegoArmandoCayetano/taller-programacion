import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NewEmptyJUnitTest {

    public NewEmptyJUnitTest() {
    }

    @Test
    public void testSuma() {
        int resultado = suma(4, 1);
        assertEquals(5, resultado);
    }
    
    @Test
    public void testResta() {
        int resultado = resta(8, 2);
        assertEquals(2, resultado);
    }

    @AfterAll
    public static void tearDownClass() {
    }
    
    // Método de ejemplo para probar la suma
    private int suma(int a, int b) {
        return a + b;
    }
    
    // Método de ejemplo para probar la resta
    private int resta(int a, int b) {
        return a - b;
    }
}
