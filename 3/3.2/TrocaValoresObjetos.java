import java.util.Scanner;

class ValorContainer {
    public int valor; // Atributo público para simplificar o exemplo
}

public class TrocaValoresObjetos {

    public static void trocarValores(ValorContainer refA, ValorContainer refB) {
        // Usa uma variável temporária para guardar o valor de A
        int temp = refA.valor;
        // Atribui o valor de B para A
        refA.valor = refB.valor;
        // Atribui o valor original de A (guardado em temp) para B
        refB.valor = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crie duas instâncias de ValorContainer
        ValorContainer objA = new ValorContainer();
        ValorContainer objB = new ValorContainer();

        // Peça ao usuário para inserir valores
        System.out.print("Digite o valor para o Objeto A: ");
        objA.valor = scanner.nextInt();
        System.out.print("Digite o valor para o Objeto B: ");
        objB.valor = scanner.nextInt();

        // Imprima os valores antes da troca
        System.out.println("\n--- Antes da troca ---");
        System.out.println("Valor de objA: " + objA.valor);
        System.out.println("Valor de objB: " + objB.valor);

        // Chame o método para trocar os valores
        trocarValores(objA, objB);

        // Imprima os valores depois da troca
        System.out.println("\n--- Depois da troca ---");
        System.out.println("Valor de objA: " + objA.valor);
        System.out.println("Valor de objB: " + objB.valor);
        
        scanner.close();
    }
}