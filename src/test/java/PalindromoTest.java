import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PalindromoTest {

    @Test
    public void testPalindromoSimple() {
        assertTrue(Palindromo.esPalindromo("anana"));
    }

    @Test
    public void testNoPalindromo() {
        assertFalse(Palindromo.esPalindromo("hola"));
    }

    @Test
    public void pruebaPalabraConMayuscula() {
        assertFalse(Palindromo.esPalindromo("Ana"));
    }

    public void pruebaPalabrasSeparadasConEspacios() {
        assertFalse(Palindromo.esPalindromo("hola mundo"));
    }

    @Test
    public void pruebaCadenaDeTextoVacio() {
        assertTrue(Palindromo.esPalindromo(" "));
    }
    @Test
    public void pruebaConPalindromoAca() {
        assertEquals(true, Palindromo.esPalindromo("aca"));
    }

    @Test
    public void pruebaConNoPalindromoAcas() {
        assertEquals(false, Palindromo.esPalindromo("acas"));
    }

    @Test
    public void pruebaConPalindromoInterrogacionHInterrogacion() {
        assertEquals(true, Palindromo.esPalindromo("h"));
    }
}
