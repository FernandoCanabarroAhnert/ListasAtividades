package LISTA3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1,num2;
        do{
            System.out.println("Digite 2 valores inteiros e positivos diferentes: ");
            System.out.print("Valor 1: ");
            num1 = ler.nextInt();
            System.out.print("Valor 2: ");
            num2 =ler.nextInt();
            if (num1 > num2){
                System.out.println("Os valores foram inseridos em ordem decrescente");
            } else if (num1 < num2){
                System.out.println("Os valores foram inseridos em ordem crescente");
            } else {
                System.out.println("Os valores são iguais!");
            }
            System.out.println("----------");
        } while(num1 != num2);



    }
}
