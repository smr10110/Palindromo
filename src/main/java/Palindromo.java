public class Palindromo {
    public static boolean esPalindromo(String cadena) {
        String resultado = new StringBuilder(cadena).reverse().toString();
        return cadena.equals(resultado);
    }

    public static void main(String[] args) {
        String ejemplo = "Ana";
        System.out.println("¿Es '" + ejemplo + "' un palindromo? " + esPalindromo(ejemplo));
    }
}
