import java.util.ArrayList;
import java.util.Scanner;

class Funcionario {
    String nome;
    int id;
    double salario;
    String departamento;

    public Funcionario(String nome, int id, double salario, String departamento) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Salário: R$" + salario + ", Depto: " + departamento;
    }
}

public class GerenciamentoFuncionarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        int proximoId = 1;

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Listar todos os Funcionários");
            System.out.println("3. Calcular total de salários por Departamento");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Salário: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a nova linha
                    System.out.print("Departamento: ");
                    String depto = scanner.nextLine();
                    funcionarios.add(new Funcionario(nome, proximoId++, salario, depto));
                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("\n--- Lista de Funcionários ---");
                    if (funcionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        for (Funcionario f : funcionarios) {
                            System.out.println(f);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do departamento para calcular o total de salários: ");
                    String deptoBusca = scanner.nextLine();
                    double totalSalarios = 0;
                    for (Funcionario f : funcionarios) {
                        if (f.departamento.equalsIgnoreCase(deptoBusca)) {
                            totalSalarios += f.salario;
                        }
                    }
                    System.out.printf("Total de salários para o depto '%s': R$ %.2f\n", deptoBusca, totalSalarios);
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