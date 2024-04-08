package LISTA3;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        do {
            System.out.println("Digite um número inteiro e positivo: ");
            num = ler.nextInt();
            for (int i = num; i >= 1 ; i--) {
                int resultado = num * i;
                System.out.println(num + " x " + i + " = " + resultado);
            }
            System.out.println("----------");
        } while ( num != 0);

    }
}
