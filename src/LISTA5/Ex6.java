package LISTA5;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] m = new int[6][6];
        int[] v = new int[36];
        System.out.println("Digite os valores da matriz M: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = ler.nextInt();
            }
        }
        System.out.println("Digite um valor para multiplicar a matriz M: ");
        int n = ler.nextInt();
        int c = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                v[c] = m[i][j] * n;
                c++;
            }
        }
        System.out.println("-----------------------------");
        System.out.println("Valores do vetor V: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println("Valor na posição " + i + " = " + v[i]);
        }

    }
}
