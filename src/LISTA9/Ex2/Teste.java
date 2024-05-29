package LISTA9.Ex2;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Entre com a medida do lado do quadrado: ");
        double lado = ler.nextDouble();
        Quadrado quadrado = new Quadrado(lado);
        System.out.println("Entre com as medidas da base e da altura do retângulo: ");
        System.out.print("Base: ");
        double base = ler.nextDouble();
        System.out.print("Altura: ");
        double altura = ler.nextDouble();
        Retangulo retangulo = new Retangulo(base,altura);

        System.out.println(quadrado);
        System.out.println();
        System.out.println(retangulo);
    }
}
