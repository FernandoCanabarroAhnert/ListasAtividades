package LISTA1;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Fahrenheit: ");
        float tempFahren = ler.nextFloat();

        float tempCelsius = (5 * (tempFahren - 32) / 9);
        System.out.printf("A temperatura em graus celsius é: %.1f" , tempCelsius);

    }
}
