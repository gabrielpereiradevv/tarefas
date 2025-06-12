import java.util.Locale;
import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Distancia percorrida: ");
        int distancia = sc.nextInt();

        System.out.print("Combustível gasto: ");
        double combustivel = sc.nextDouble();

        double consumoMedio = (double) distancia / combustivel;

        System.out.printf("Consumo medio = %.3f%n", consumoMedio);

        sc.close();
    }
}