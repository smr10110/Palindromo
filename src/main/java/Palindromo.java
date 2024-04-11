import java.util.Scanner;

public class Palindromo {
    public static boolean esPalindromo(String cadena) {
        if (cadena == null) {
            throw new IllegalArgumentException("El texto no puede ser null");
        }

        String textoLimpio = cadena.trim();
        if (textoLimpio.isEmpty()) {
            return false;
        }

        textoLimpio = textoLimpio.toLowerCase().replaceAll("[^a-z0-9]", "");

        int izquierda = 0;
        int derecha = textoLimpio.length() - 1;
        while (izquierda < derecha) {
            if (textoLimpio.charAt(izquierda) != textoLimpio.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }

        return true;
    }

    public static void verificarPalindromo() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Introduce una palabra para verificar si es un palindromo:");
            String input = scanner.nextLine();

            System.out.println("¿Es '" + input + "' un palindromo? " + esPalindromo(input));
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        verificarPalindromo();
    }
}
