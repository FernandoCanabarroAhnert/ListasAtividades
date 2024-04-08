package LISTA4;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] valores = new int[6];
        double soma = 0;
        int multiplicacao = 1;
        System.out.println("Digite 6 valores: ");
        for (int i = 0; i < valores.length; i++) {
            valores[i] = ler.nextInt();
            soma += valores[i];
        }
        System.out.println("Escolha a opcao desejada:");
        System.out.println("1- Soma dos elementos");
        System.out.println("2- Produto dos elementos");
        System.out.println("3- Média dos elementos");
        System.out.println("4- Mostre o vetor");

        int identificadora = ler.nextInt();

        switch (identificadora){
            case 1:
                System.out.println("A soma dos elementos é: " + soma);
                break;
            case 2:
                for (int i = 0; i < valores.length; i++) {
                    multiplicacao *= valores[i];
                }
                System.out.println("O produto dos elementos é: " + multiplicacao);
                break;
            case 3:
                System.out.printf("A média dos elementos é: %.2f" , soma / valores.length);
                break;
            case 4:
                for (int vetor : valores){
                    System.out.println(vetor);
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }


    }
}
