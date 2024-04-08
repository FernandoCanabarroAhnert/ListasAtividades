package LISTA4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] z = new int[20];
        System.out.println("Digite os 20 valores do vetor Z: ");
        for (int i = 0; i < z.length; i++) {
            z[i] = ler.nextInt();
        }
        Arrays.sort(z);
        for (int w : z){
            System.out.println(w);
        }

    }
}
