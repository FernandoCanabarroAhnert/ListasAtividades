package LISTA6;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite dois valores: ");
        int n1 = ler.nextInt();
        int n2 = ler.nextInt();
        System.out.println("Produto = " + produto(n1,n2));
    }
    static int produto(int n1, int n2){
        return n1 * n2;
    }
}
