import java.util.Random;
import java.util.Scanner;

public class MaiorMenorMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de linhas (m): ");
        int m = scanner.nextInt();
        System.out.print("Informe o número de colunas (n): ");
        int n = scanner.nextInt();

        int[][] matriz = new int[m][n];
        Random random = new Random();

        System.out.println("\nMatriz gerada:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(100);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int maior = matriz[0][0];
        int menor = matriz[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("\nMaior elemento da matriz: " + maior);
        System.out.println("Menor elemento da matriz: " + menor);

        scanner.close();
    }
}