import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Base do retangulo: ");
        double base = sc.nextDouble();

        System.out.print("Altura do retangulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);
        double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

        System.out.printf("AREA = %.4f%n", area);
        System.out.printf("PERIMETRO = %.4f%n", perimetro);
        System.out.printf("DIAGONAL = %.4f%n", diagonal);

        sc.close();
    }
}