package LISTA3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor inteiro e positivo: ");
        int valor = ler.nextInt();

        int somaDivisores = 0;

        for (int i = 1; i < valor; i++) {
            if (valor % i == 0){
                somaDivisores += i;
            }
        }
        System.out.println("Soma dos divisores: " + somaDivisores);
        if (valor == 0 || valor == 1){
            System.out.println("Os valores 0 e 1 não são considerados números perfeitos!");
        }
        else if (valor != somaDivisores){
            System.out.printf("O valor %d não é um número perfeito =(", valor);
        }
        else if (valor % somaDivisores == 0){
            System.out.printf("O valor %d é um número perfeito!", valor);
        }

    }
}
