package LISTA3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite os valores A e B:    obs.: A < B");
        System.out.print("Valor A: ");
        int a = ler.nextInt();
        System.out.print("Valor B: ");
        int b = ler.nextInt();

        int somaAB = 0;

        if (a < b){
            System.out.println("Valores divisíveis por 5 entre os números A e B: ");
            for (int i = a; i <= b ; i++) {
                if (i % 5 == 0){
                    System.out.println(i);
                    somaAB += i;
                }
            }
            System.out.println("A soma é: " + somaAB);
        } else {
            System.out.println("Valores incompatíveis!");
        }

    }
}
