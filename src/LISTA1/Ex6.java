package LISTA1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float raioCirculo, areaCirculo,pi = (float) 3.141592;
        System.out.println("Digite o raio do círculo: ");
        raioCirculo = ler.nextFloat();

        areaCirculo = pi * raioCirculo * raioCirculo;
        System.out.printf("A área do círculo é igual a: %.2f" , areaCirculo);


    }
}
