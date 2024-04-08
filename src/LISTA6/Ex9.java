package LISTA6;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        int[] a = new int[30];
        int[] b = new int[30];
        lerVetor(a);
        lerVetor(b);
        intersecAB(a,b);
    }
    static void lerVetor(int[] v){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite os valores do vetor: ");
        for (int i = 0; i < v.length; i++) {
            v[i] = ler.nextInt();
        }
    }
    static void intersecAB(int[] a, int[] b){
        int[] c = new int[30];
        double ale;
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
