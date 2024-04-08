package LISTA4;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de valores a serem inseridos: ");
        int qde = ler.nextInt();
        int[] par = new int[qde];
        int[] impar = new int[qde];
        int qdePar = 0, qdeImpar = 0;
        System.out.println("Digite os valores: ");
        for (int i = 0; i < qde; i++) {
            int valor = ler.nextInt();
            if (valor % 2 == 0) {
                par[i] = valor;
                qdePar++;
            } else {
                impar[i] = valor;
                qdeImpar++;
            }
        }
        System.out.println("Números pares: ");
        if (qdePar > 0) {
            for (int i = 0; i < par.length; i++) {
                if (par[i] == 0) {
                    continue;
                }
                System.out.println(par[i]);
            }
        } else {
            System.out.println("Nenhum");
        }

        System.out.println("Números impares: ");
        if (qdeImpar > 0) {
            for (int i = 0; i < impar.length; i++) {
                if (impar[i] == 0) {
                    continue;
                }
                System.out.println(impar[i]);
            }
        } else {
            System.out.println("Nenhum");
        }


    }
}
