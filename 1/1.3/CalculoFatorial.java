import java.util.Scanner;

public class CalculoFatorial {
    public static long calcularFatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo para calcular o fatorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Erro: Não é possível calcular o fatorial de um número negativo.");
        } else {
            long resultado = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é " + resultado);
        }

        scanner.close();
    }
}