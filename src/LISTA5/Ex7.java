package LISTA5;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] m = new int[5][5];
        int somaLinha4 = 0, somaColuna2 = 0, somaDiagonalPrincipal = 0, somaTot = 0;
        System.out.println("Digite os valores da matriz M: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = ler.nextInt();
                somaTot += m[i][j];
                if (i == 3){
                    somaLinha4 += m[i][j];
                }
                if (j == 1){
                    somaColuna2 += m[i][j];
                }
                if (i == j){
                    somaDiagonalPrincipal += m[i][j];
                }
            }
        }
        System.out.println("--------------");
        System.out.println("Soma da linha 4 = " + somaLinha4);
        System.out.println("Soma da coluna 2 = " + somaColuna2);
        System.out.println("Soma da diagonal principal = " + somaDiagonalPrincipal);
        System.out.println("Soma de todos os elementos da matriz M = " + somaTot);
        System.out.println("Matriz M: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println(" ");
        }



    }
}
