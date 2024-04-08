package LISTA2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = ler.nextInt();
        if (valor % 2 == 0){
            System.out.println("Valor é PAR");
        } else{
            System.out.println("Valor é IMPAR");
        }

    }
}
