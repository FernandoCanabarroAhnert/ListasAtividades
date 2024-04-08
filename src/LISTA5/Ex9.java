package LISTA5;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] m = new int[3][3];
        double somaDS = 0;
        System.out.println("Digite os valores da matriz M: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = ler.nextInt();
            }
        }
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i][i] + " ");
        }
        System.out.println("\nDiagonal secundária: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i + j == m.length - 1) {
                    System.out.print(m[i][j] + " ");
                    somaDS += m[i][j];
                }
            }
        }
        double mediaDS = somaDS / 3;
        System.out.printf("\nMédia da diagonal secundária = %.2f", mediaDS);
        System.out.println("\n--------------------------------");
        System.out.println("Multiplicação dos elementos da diagonal principal com a média dos elementos da diagonal secundária:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    System.out.print(m[i][j] * mediaDS + " ");
                }
            }
        }


    }
}
