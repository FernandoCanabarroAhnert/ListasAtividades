package LISTA1;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int segTotal, horas, minutos, segundos;
        System.out.println("Digite a quantidade de horas: ");
        horas = ler.nextInt();
        System.out.println("Digite a quantidade de minutos: ");
        minutos = ler.nextInt();
        System.out.println("Digite a quantidade de segundos: ");
        segundos = ler.nextInt();

        segTotal = horas * 60 * 60 + minutos * 60 + segundos;
        System.out.println("Quantidade total de segundos: " + segTotal);

    }
}
