package LISTA2;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float precoLaranja = 0.30f;
        int qdeLaranjas;

        System.out.println("Digite a quantidade de laranjas que quer comprar: ");
        qdeLaranjas = ler.nextInt();

        if (qdeLaranjas >= 12){
            precoLaranja = 0.25f;
        }
        float precoTotal = precoLaranja * qdeLaranjas;

        if (qdeLaranjas > 0) {
            System.out.println("---- VALOR DA COMPRA ----");
            System.out.printf("%d unidade(s) de laranjas a R$%.2f a unidade = R$%.2f", qdeLaranjas, precoLaranja, precoTotal);
        } else {
            System.out.println("COMPRA INVÁLIDA");
        }

    }
}
