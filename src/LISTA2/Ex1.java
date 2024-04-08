package LISTA2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int n = ler.nextInt();
        if (n > 100){
            System.out.println("O valor é maior que 100");
        }

    }
}
