package LISTA6;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 2 valores: ");
        int n1 = ler.nextInt();
        int n2 = ler.nextInt();
        maiorMenor(n1,n2);
    }
    static void maiorMenor(int n1,int n2){
        if (n1 > n2){
            System.out.printf("%d é o MAIOR!" , n1);
        } else {
            System.out.printf("%d é o MAIOR!" , n2);
        }
    }
}
