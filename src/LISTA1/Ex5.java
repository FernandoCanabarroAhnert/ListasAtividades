package LISTA1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int x = ler.nextInt();

        System.out.println("O conteúdo de X é: " + x);
        System.out.println("O quadrado de X: " + Math.pow(x,2));
        System.out.println("Resto da divisão de x por 3: " + x % 3);
        System.out.printf("Metade de X: %.2f\n", (float) x / 2 );
        System.out.printf("Resultado do produto de X * a metade de X: %.2f" , (float) x * x / 2);

    }
}
