package LISTA5;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] m = new int[10][10];
        float somaDiag = 0;
        System.out.println("Digite os valores da matriz M: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = ler.nextInt();
                if (i == j){
                    somaDiag += m[i][j];
                }
            }
        }
        System.out.printf("Média dos elementos da diagonal principal = %.2f" , somaDiag / m.length);

    }
}
