package LISTA4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[20];
        int qdePar = 0;
        System.out.println("Digite os valores do vetor de 20 posições: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = ler.nextInt();
            if (vetor[i] % 2 == 0){
                qdePar++;
            }
        }
        System.out.println("Quantidade de valores par: " + qdePar);

    }
}
