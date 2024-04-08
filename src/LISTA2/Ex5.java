package LISTA2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = ler.nextInt();
        if (num > 100 && num < 200){
            System.out.println("O número está entre 100 e 200");
        } else {
            System.out.println("O número não está entre 100 e 200");
        }

    }
}
