import java.util.Scanner;

class Calculadora {
    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return Double.NaN;
        }
        return a / b;
    }
}

public class TesteCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1: Soma (+)");
        System.out.println("2: Subtração (-)");
        System.out.println("3: Multiplicação (*)");
        System.out.println("4: Divisão (/)");
        System.out.print("Opção: ");
        int operacao = scanner.nextInt();

        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = calc.somar(num1, num2);
                break;
            case 2:
                resultado = calc.subtrair(num1, num2);
                break;
            case 3:
                resultado = calc.multiplicar(num1, num2);
                break;
            case 4:
                resultado = calc.dividir(num1, num2);
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return;
        }

        if (!Double.isNaN(resultado)) {
            System.out.println("Resultado: " + resultado);
        }
        
        scanner.close();
    }
}