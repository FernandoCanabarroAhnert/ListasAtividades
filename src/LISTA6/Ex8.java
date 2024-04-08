package LISTA6;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] x = new int[10];
        System.out.println("Digite os valores do vetor X: ");
        for (int i = 0; i < x.length; i++) {
            x[i] = ler.nextInt();
        }
        vetorModificado(x);
    }
    static void vetorModificado(int[] a){
        int[] y = new int[a.length];
        for (int i = 0; i < y.length; i++) {
            if (i % 2 == 0){
                y[i] = a[i] * 2;
            } else {
                y[i] = a[i] * 3;
            }
        }
        System.out.println("Vetor modificado: ");
        for (int z : y){
            System.out.println(z);
        }
    }
}
