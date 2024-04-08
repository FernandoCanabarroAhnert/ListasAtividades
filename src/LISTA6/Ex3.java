package LISTA6;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int n = ler.nextInt();
        parOuImpar(n);
    }
    static void parOuImpar(int n){
        if (n % 2 == 0){
            System.out.println("É PAR!");
        } else {
            System.out.println("É IMPAR!");
        }

    }
}
