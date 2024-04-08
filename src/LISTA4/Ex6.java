package LISTA4;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] a = new int[30];
        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = ler.nextInt();
        }
        System.out.println("Números positivos e suas respectivas posições: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0){
                System.out.println("Número " + a[i] + " na posição " + i);
            }
        }


    }
}
