import java.util.Locale;
import java.util.Scanner;

public class Troco {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double precoUnitario = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        double dinheiroRecebido = sc.nextDouble();

        double total = precoUnitario * quantidade;
        double troco = dinheiroRecebido - total;

        System.out.printf("TROCO = %.2f%n", troco);

        sc.close();
    }
}