import java.util.Scanner;
import java.util.Random;

public class SomaDiagonais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a ordem da matriz quadrada (n): ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];
        Random random = new Random();

        System.out.println("\nMatriz gerada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(10); // Valores de 0 a 9
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        for (int i = 0; i < n; i++) {
            somaDiagonalPrincipal += matriz[i][i];
            somaDiagonalSecundaria += matriz[i][n - 1 - i];
        }

        System.out.println("\nSoma da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);
        
        scanner.close();
    }
}