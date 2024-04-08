package LISTA1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 4 valores inteiros: ");
        int num1,num2,num3,num4;
        num1 = ler.nextInt();
        num2 = ler.nextInt();
        num3 = ler.nextInt();
        num4 = ler.nextInt();

        int soma = num1+ num2 + num3 + num4;
        float media = (float) soma / 4;
        System.out.printf("A média é: %.2f" ,media );


    }
}
