package LISTA4;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = ler.nextInt();
        }
        int[] b = new int[10];
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = ler.nextInt();
        }
        int[] c = new int[10];
        System.out.println("Valores da união dos vetores A e B: ");
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i] = a[i] + b[i]);
        }


    }
}
