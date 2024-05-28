package LISTA8.Ex2;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ContaCorrente contaCorrente = new ContaCorrente(123,"Fernando");
        System.out.println("=== MENU ===");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("<< -- Estado Inicial da Conta Corrente -- >>");
        int op;
        do {
            System.out.print("Digite umas das opções ou -1 para encerrar o programa: ");
            op = ler.nextInt();
            switch (op){
                case 1:
                    System.out.print("Entre com o valor de depósito: ");
                    double deposito = ler.nextDouble();
                    contaCorrente.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Entre com o valor de saque: ");
                    double saque = ler.nextDouble();
                    contaCorrente.sacar(saque);
                    break;
                case -1:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida!Tente novamente");
                    break;
            }
        } while (op != -1);
    }
}
