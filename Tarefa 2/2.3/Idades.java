import java.util.Locale;
import java.util.Scanner;

public class Idades {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Dados da primeira pessoa:");
        System.out.print("Nome: ");
        String nome1 = sc.nextLine();
        System.out.print("Idade: ");
        int idade1 = sc.nextInt();
        
        sc.nextLine(); 

        System.out.println("Dados da segunda pessoa:");
        System.out.print("Nome: ");
        String nome2 = sc.nextLine();
        System.out.print("Idade: ");
        int idade2 = sc.nextInt();

        double idadeMedia = (double) (idade1 + idade2) / 2.0;

        System.out.printf("A idade média de %s e %s é de %.1f anos%n", nome1, nome2, idadeMedia);

        sc.close();
    }
}