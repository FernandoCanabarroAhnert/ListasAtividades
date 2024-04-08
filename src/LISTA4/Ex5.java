package LISTA4;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = ler.nextInt();
        }
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = ler.nextInt();
        }
        System.out.println("Vetor resultante: ");
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i] = a[i] * b[i]);
        }

    }
}
