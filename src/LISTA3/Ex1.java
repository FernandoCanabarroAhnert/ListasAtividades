package LISTA3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int somaPar = 0, somaImpar = 0, qdePar = 0, qdeImpar = 0;

        System.out.println("Digite um valor inteiro e positivo: ");
        int valor = ler.nextInt();

        for (int i = 1; i <= valor ; i++) {
            if (i % 2 == 0){
                qdePar++;
                somaPar += i;
            } else  {
                qdeImpar++;
                somaImpar += i;
            }
        }
        System.out.println("Quantidade de números pares entre 1 e o valor digitado: " + qdePar);
        System.out.println("Soma dos números pares: " + somaPar);
        System.out.println("Quantidade de números impares entre 1 e o valor digitado: " + qdeImpar);
        System.out.println("Soma dos números impares: " + somaImpar);

    }
}
