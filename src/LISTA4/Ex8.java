package LISTA4;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] m = new int[10];
        System.out.println("Digite os valores do vetor M: ");
        for (int i = 0; i < m.length; i++) {
            m[i] = ler.nextInt();
        }
        int[] mod = new int[m.length];
        System.out.println("Valores do vetor modificado: ");
        for (int i = 0; i < m.length / 2; i++) {
            mod[i] = m[i + 5];
            System.out.println(mod[i]);
        }
        for (int i = 0; i < m.length / 2; i++) {
            mod[i + 5] = m[i];
            System.out.println(mod[i+5]);
        }


    }
}
