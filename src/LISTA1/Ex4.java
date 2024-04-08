package LISTA1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 4 valores: ");
        float num1,num2,num3,num4;
        num1 = ler.nextFloat();
        num2 = ler.nextFloat();
        num3 = ler.nextFloat();
        num4 = ler.nextFloat();

        float soma = num1+ num2 + num3 + num4;
        float media = soma / 4;
        System.out.printf("A média é: %.2f" ,media );

    }
}
