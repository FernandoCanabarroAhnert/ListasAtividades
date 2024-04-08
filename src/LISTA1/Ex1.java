package LISTA1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite dois valores: ");
        int num1 = ler.nextInt();
        int num2 = ler.nextInt();

        int produto = num1 * num2;
        System.out.println("O resultado do produto é igual a: " + produto);
    }
}
