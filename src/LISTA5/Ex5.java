package LISTA5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] a = new int[5][5];
        System.out.println("Digite os valores da matriz A: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = ler.nextInt();
            }
        }
        int[][] b = new int[5][5];
        System.out.println("Digite os valores da matriz B: ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = ler.nextInt();
            }
        }
        int[][] soma = new int[5][5];
        System.out.println("Matriz da soma das matrizes A e B: ");
        for (int i = 0; i < soma.length; i++) {
            for (int j = 0; j < soma[i].length; j++) {
                soma[i][j] = a[i][j] + b[i][j];
                System.out.print(soma[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
