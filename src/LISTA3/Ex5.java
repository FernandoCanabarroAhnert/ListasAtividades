package LISTA3;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor;
        do {
            System.out.println("Digite um valor: ");
            valor = ler.nextInt();
            if (valor > 0) {
                System.out.printf("A tabuada de %d, de 1 a 10 é: \n", valor);
                for (int i = 1; i <= 10; i++) {
                    int tab = valor * i;
                    System.out.println(valor + " x " + i + " = " + tab);
                }
                System.out.println("----------");
            } else {
                System.out.println("Valor inválido!");
            }
        } while ( valor > 0);


    }
}
