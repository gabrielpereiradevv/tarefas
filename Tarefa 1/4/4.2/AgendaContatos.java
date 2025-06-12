import java.util.ArrayList;
import java.util.Scanner;

class Contato {
    String nome;
    String telefone;
    String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Telefone: " + telefone + " | Email: " + email;
    }
}

public class AgendaContatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList<>();
        final int MAX_CONTATOS = 10;

        while (true) {
            System.out.println("\n--- Agenda de Contatos ---");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Listar Contatos");
            System.out.println("3. Procurar Contato por nome");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    if (contatos.size() >= MAX_CONTATOS) {
                        System.out.println("Agenda cheia! Não é possível adicionar mais contatos.");
                        break;
                    }
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    contatos.add(new Contato(nome, telefone, email));
                    System.out.println("Contato adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("\n--- Lista de Contatos ---");
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato na agenda.");
                    } else {
                        for (Contato c : contatos) {
                            System.out.println(c);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do contato a ser procurado: ");
                    String nomeBusca = scanner.nextLine();
                    boolean encontrado = false;
                    for (Contato c : contatos) {
                        if (c.nome.equalsIgnoreCase(nomeBusca)) {
                            System.out.println("Contato encontrado:");
                            System.out.println("Telefone: " + c.telefone);
                            System.out.println("Email: " + c.email);
                            encontrado = true;
                            break; // Para a busca após encontrar o primeiro correspondente
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}