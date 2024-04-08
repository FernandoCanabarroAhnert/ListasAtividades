package LISTA4;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] x = new int[10];
        System.out.println("Digite os valores do vetor X: ");
        for (int i = 0; i < x.length; i++) {
            x[i] = ler.nextInt();
        }
        int[] y = new int[x.length];
        for (int i = 0; i < y.length; i++) {
            if (i % 2 == 0){
                y[i] = x[i] * 2;
            } else {
                y[i] = x[i] * 3;
            }
        }
        for (int z : y){
            System.out.println(z);
        }

    }
}
