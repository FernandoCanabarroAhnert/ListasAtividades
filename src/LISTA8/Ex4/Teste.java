package LISTA8.Ex4;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Moeda umCentavo = new Moeda("1 Centavo", 0.01);
        Moeda cincoCentavos = new Moeda("5 Centavos", 0.05);
        Moeda dezCentavos = new Moeda("10 Centavos", 0.10);
        Moeda vinteCincoCentavos = new Moeda("25 Centavos", 0.25);
        Moeda cinquentaCentavos = new Moeda("50 Centavos", 0.50);
        Moeda umReal = new Moeda("Um Real", 1.00);

        Cofrinho cofrinho = new Cofrinho();

        imprimirMenu(cofrinho);
        char op;
        do {
            System.out.println("Digite uma opção ou Z para encerrar o programa: ");
            op = ler.next().toLowerCase().charAt(0);
            switch (op) {
                case 'a':
                  imprimirValores();
                    System.out.print("Digite uma opção de moeda para ser adicionada ao cofrinho: ");
                    int a = ler.nextInt();
                    switch (a) {
                        case 1:
                            cofrinho.adicionarMoeda(umCentavo);
                            break;
                        case 2:
                            cofrinho.adicionarMoeda(cincoCentavos);
                            break;
                        case 3:
                            cofrinho.adicionarMoeda(dezCentavos);
                            break;
                        case 4:
                            cofrinho.adicionarMoeda(vinteCincoCentavos);
                            break;
                        case 5:
                            cofrinho.adicionarMoeda(cinquentaCentavos);
                            break;
                        case 6:
                            cofrinho.adicionarMoeda(umReal);
                            break;
                        default:
                            System.out.println("Moeda inválida!Tente novamente");
                            break;
                    }
                    break;
                case 'r':
                    imprimirValores();
                    cofrinho.moedasPresentes();
                    System.out.print("Digite uma opção de moeda para ser retirada do cofrinho: ");
                    int r = ler.nextInt();
                    switch (r) {
                        case 1:
                            cofrinho.retirarMoeda(umCentavo);
                            break;
                        case 2:
                            cofrinho.retirarMoeda(cincoCentavos);
                            break;
                        case 3:
                            cofrinho.retirarMoeda(dezCentavos);
                            break;
                        case 4:
                            cofrinho.retirarMoeda(vinteCincoCentavos);
                            break;
                        case 5:
                            cofrinho.retirarMoeda(cinquentaCentavos);
                            break;
                        case 6:
                            cofrinho.retirarMoeda(umReal);
                            break;
                        default:
                            System.out.println("Moeda inválida!Tente novamente");
                            break;
                    }
                    break;
                case 'z':
                    System.out.println("Programa encerrado...");
                    break;
                default:
                    System.out.println("Opção inválida!Tente novamente");
                    System.out.println(cofrinho);
                    break;
            }
        } while (op != 'z');
    }
    private static void imprimirMenu(Cofrinho cofrinho){
        System.out.println("=== MENU ===");
        System.out.println("--> Operações:");
        System.out.println("A para adicionar uma moeda");
        System.out.println("R para remover uma moeda");
        System.out.println("---------------------");
        System.out.println("--> Estado do Cofre...");
        System.out.println(cofrinho);
    }
    private static void imprimirValores(){
        System.out.println("--> Valores: ");
        System.out.println("1. R$0.01");
        System.out.println("2. R$0.05");
        System.out.println("3. R$0.10");
        System.out.println("4. R$0.25");
        System.out.println("5. R$0.50");
        System.out.println("6. R$1.00");
    }
}
