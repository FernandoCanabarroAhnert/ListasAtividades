package LISTA2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor 1: ");
        int valor1 = ler.nextInt();
        System.out.println("Digite o valor 2: ");
        int valor2 = ler.nextInt();

        if (valor1 < valor2){
            System.out.println("O valor " + valor1 + " é o menor");
        } else{
            System.out.println("O valor " + valor2 + " é o menor");
        }

    }
}
