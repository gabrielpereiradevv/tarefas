import java.util.Scanner;

public class Duracao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a duracao em segundos: ");
        int duracaoSegundos = sc.nextInt();

        int horas = duracaoSegundos / 3600;
        int resto = duracaoSegundos % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);

        sc.close();
    }
}