import java.util.Scanner;

class ConversorTemperatura {
    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}

public class TesteConversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorTemperatura conversor = new ConversorTemperatura();

        System.out.println("Escolha a direção da conversão:");
        System.out.println("1: Celsius -> Fahrenheit");
        System.out.println("2: Fahrenheit -> Celsius");
        System.out.print("Opção: ");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double tempCelsius = scanner.nextDouble();
            double tempFahrenheit = conversor.celsiusParaFahrenheit(tempCelsius);
            System.out.printf("%.2f°C equivale a %.2f°F\n", tempCelsius, tempFahrenheit);
        } else if (escolha == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double tempFahrenheit = scanner.nextDouble();
            double tempCelsius = conversor.fahrenheitParaCelsius(tempFahrenheit);
            System.out.printf("%.2f°F equivale a %.2f°C\n", tempFahrenheit, tempCelsius);
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}