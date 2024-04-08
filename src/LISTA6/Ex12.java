package LISTA6;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        int[][] m = new int[10][10];
        lerValores(m);
        mediaDiagonal(m);
    }
    static void lerValores(int[][] m){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite os valores da matriz M: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = ler.nextInt();
            }
        }
    }
    static void mediaDiagonal(int[][] m){
        float somaDiag = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j){
                    somaDiag += m[i][j];
                }
            }
        }
        System.out.printf("Média dos elementos da diagonal principal = %.2f" , somaDiag / 10);
    }

}
