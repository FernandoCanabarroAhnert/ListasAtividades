package LISTA6;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int n1 = ler.nextInt();
        numerosParesImpares(n1);
    }
    static void numerosParesImpares(int n1){
        int qdePar = 0, somaPar = 0, qdeImpar = 0, somaImpar = 0;
        for (int i = 1; i <= n1 ; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0){
                qdePar++;
                somaPar += i;
            } else {
                qdeImpar++;
                somaImpar += i;
            }
        }
        System.out.println("\nQuantidade de números pares: " + qdePar);
        System.out.println("Soma dos valores pares = " + somaPar);
        System.out.println("Quantidade de números impares: " + qdeImpar);
        System.out.println("Soma dos valores impares = " + somaImpar);
    }
}
