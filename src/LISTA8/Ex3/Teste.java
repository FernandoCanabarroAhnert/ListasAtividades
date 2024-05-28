package LISTA8.Ex3;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com os dados do funcionário CLT:");
        System.out.print("Nome: ");
        String nomeClt = ler.nextLine();
        System.out.print("CPF: ");
        String cpfClt = ler.nextLine();
        System.out.print("Salário: ");
        double salarioMensal = ler.nextDouble();
        FuncionarioCLT clt = new FuncionarioCLT(nomeClt,cpfClt,salarioMensal);
        System.out.println("-----------------------------");
        System.out.println("Entre com os dados do funcionário horista:");
        System.out.print("Nome: ");
        ler.nextLine();
        String nomeHora = ler.nextLine();
        System.out.print("CPF: ");
        String cpfHora = ler.nextLine();
        System.out.print("Salário por hora: ");
        double salarioHora = ler.nextDouble();
        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = ler.nextInt();
        FuncionarioHorista hora = new FuncionarioHorista(nomeHora,cpfHora,salarioHora,horasTrabalhadas);
        System.out.println("=======================================");
        System.out.println("--> Dados do Funcionário CLT:");
        System.out.println(clt);
        System.out.println();
        System.out.println("--> Dados do Funcionário Horista:");
        System.out.println(hora);
        System.out.println();
    }
}
