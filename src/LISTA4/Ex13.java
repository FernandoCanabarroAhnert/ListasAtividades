package LISTA4;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double ale;
        int[] a = new int[30];
        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = ler.nextInt();
        }
        int[] b = new int[30];
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = ler.nextInt();
        }
        int[] c = new int[30];
        System.out.println("Vetor dos elementos entre os valores de cada posição de A e B: ");
        for (int i = 0; i < c.length; i++) {
            if (a[i] > b[i]){
                ale = b[i] + Math.random() * (a[i] - b[i]);
            } else {
                ale = a[i] + Math.random() * (b[i] - a[i]);
            }
            c[i] = (int) ale;
            System.out.println(c[i]);
        }

    }
}
