package LISTA2;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de eleitores, a de votos válidos, a de votos brancos e a de votos nulos: ");
        System.out.print("Quantidade de eleitores: ");
        double qdeEleit = ler.nextDouble();
        System.out.print("Votos válidos: ");
        double qdeVV = ler.nextDouble();
        System.out.print("Votos brancos: ");
        double qdeVB = ler.nextDouble();
        System.out.print("Votos nulos: ");
        double qdeVN = ler.nextDouble();

        System.out.println("Porcentagem de votos válidos: " + qdeVV * 100 / qdeEleit + "%");
        System.out.println("Porcentagem de votos brancos: " + qdeVB * 100 / qdeEleit + "%");
        System.out.println("Porcentagem de votos nulos: " + qdeVN * 100 / qdeEleit + "%");

    }
}
