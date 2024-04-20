package LISTA7.Ex1;

import java.util.Scanner;

public class TestaQuadrado {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a medida lado do quadrado: ");
        double ladoDoQuadrado = ler.nextDouble();
        Quadrado quadrado = new Quadrado(ladoDoQuadrado);
        System.out.println(quadrado);
    }
}
