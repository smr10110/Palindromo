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

    @Test
    public void casoDePrueba1_EnteroNoEsString() {

        assertEquals(false, Palindromo.esPalindromo("200"));
    }

    @Test
    public void casoDePrueba2_CadenaVacia() {
        assertEquals(true, Palindromo.esPalindromo(""));
    }

    @Test
    public void casoDePrueba3_PalindromoSimetrico() {
        assertEquals(true, Palindromo.esPalindromo("aaabccbaaa"));
    }

    @Test
    public void casoDePrueba4_PalindromoNoSimetrico() {
        assertEquals(false, Palindromo.esPalindromo("ahabccbaaa"));
    }

    @Test
    public void casoDePrueba5_FraseConEspacios() {
        assertEquals(false, Palindromo.esPalindromo("La tele letal"));
    }
}
