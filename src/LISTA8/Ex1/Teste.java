package LISTA8.Ex1;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[2];
        System.out.println("Entre com os dados dos dois funcionários: ");
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Funcionário #" + (i + 1) + ": ");
            System.out.print("Nome: ");
            String nome = ler.nextLine();
            System.out.print("CPF: ");
            String cpf = ler.nextLine();
            funcionarios[i] = new Funcionario(nome, cpf);
            System.out.println("--------------------------------");
        }
        System.out.println("Entre com os dados do gerente:");
        System.out.print("Nome: ");
        String nome = ler.nextLine();
        System.out.print("CPF: ");
        String cpf = ler.nextLine();
        System.out.print("Departamento: ");
        String departamento = ler.nextLine();
        Gerente gerente = new Gerente(nome, cpf, departamento);
        System.out.println("========================");
        System.out.println("Dados dos funcionários da empresa...");
        System.out.println("Funcionários:");
        for (Funcionario f : funcionarios){
            System.out.println(f);
            System.out.println("----------------------");
        }
        System.out.println("Gerente:");
        System.out.println(gerente);
    }
}
