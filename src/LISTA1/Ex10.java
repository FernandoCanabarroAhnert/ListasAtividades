package LISTA1;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qdeHomens, qdeMulheres, qdeCriancas, qdeCarne;
        int mediaHomens = 650, mediaMulher = 420, mediaCria = 290;

        System.out.println("Digite a quantidade de convidados homens: ");
        qdeHomens = ler.nextInt();
        System.out.println("Digite a quantidade de convidados mulheres: ");
        qdeMulheres = ler.nextInt();
        System.out.println("Digite a quantidade de convidados crianças ");
        qdeCriancas = ler.nextInt();

        qdeCarne = qdeHomens * mediaHomens + qdeMulheres * mediaMulher + qdeCriancas * mediaCria;
        System.out.println("A quantidade total de carne, em gramas: " + qdeCarne);


    }
}
