import java.util.Scanner;

public class VerificadorPalindromo{
    public static boolean ehPalindromo(String texto) {
        String textoTratado = texto.replaceAll("\\s+", "").toLowerCase();
        
        String textoInvertido = new StringBuilder(textoTratado).reverse().toString();
        
        return textoTratado.equals(textoInvertido);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase para verificar se é um palíndromo: ");
        String entrada = scanner.nextLine();

        if (ehPalindromo(entrada)) {
            System.out.println("'" + entrada + "' é um palíndromo!");
        } else {
            System.out.println("'" + entrada + "' não é um palíndromo.");
        }

        scanner.close();
    }
}