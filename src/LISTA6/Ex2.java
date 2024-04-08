package LISTA6;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite quatro valores: ");
        int n1 = ler.nextInt();
        int n2 = ler.nextInt();
        int n3 = ler.nextInt();
        int n4 = ler.nextInt();
        System.out.printf("Média = %.2f" , media(n1,n2,n3,n4));
    }
    static float media(int n1, int n2, int n3, int n4){
        return (float) (n1 + n2 + n3 + n4) / 4;

    }
}
