package LISTA1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 3 valores inteiros: ");
        int num1,num2,num3;
        num1 = ler.nextInt();
        num2 = ler.nextInt();
        num3 = ler.nextInt();

        int soma = num1+ num2 + num3;
        System.out.println("A soma é: " + soma);

    }
}
