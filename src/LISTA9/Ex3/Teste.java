package LISTA9.Ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Empregado> empregados = new ArrayList<>();
        System.out.print("Quantos funcionários serão inseridos? ");
        int n = ler.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Entre com os dados do funcionário #" + (i + 1) + ":");
            System.out.print("Nome: ");
            ler.nextLine();
            String nome = ler.nextLine();
            System.out.print("Sobrenome: ");
            String sobrenome = ler.nextLine();
            System.out.print("CPF: ");
            String cpf = ler.nextLine();
            char tipo;
            do {
                System.out.print("CLT, Horista ou Comissionado (c/h/m)? ");
                tipo = ler.next().toLowerCase().charAt(0);
                if (tipo == 'c') {
                    System.out.print("Salário: ");
                    double salario = ler.nextDouble();
                    empregados.add(new EmpregadoCLT(nome, sobrenome, cpf, salario));
                } else if (tipo == 'h') {
                    System.out.print("Salário por Hora: ");
                    double salarioPorHora = ler.nextDouble();
                    System.out.print("Horas Semanais: ");
                    int horasSemanais = ler.nextInt();
                    empregados.add(new EmpregadoHorista(nome, sobrenome, cpf, salarioPorHora, horasSemanais));
                } else if (tipo == 'm') {
                    System.out.print("Venda Bruta Mensal: ");
                    double vendaBrutaMensal = ler.nextDouble();
                    System.out.print("Comissão: ");
                    double comissao = ler.nextDouble();
                    empregados.add(new EmpregadoComissionado(nome, sobrenome, cpf, vendaBrutaMensal, comissao));
                } else System.out.println("Opção inválida!Tente novamente:");
            } while (tipo != 'c' && tipo != 'h' && tipo != 'm');
            System.out.println("----------------------------------");
        }
        System.out.println("========================");
        System.out.println("Dados dos Funcionários:");
        empregados.forEach(System.out::println);
    }
}
