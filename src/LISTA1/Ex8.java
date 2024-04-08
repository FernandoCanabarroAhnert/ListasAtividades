package LISTA1;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float tamanhoPolegadas = (float) 25.4, compMilimetros, compPolegadas;
        System.out.println("Digite o comprimento em polegadas: ");
        compPolegadas = ler.nextFloat();
        compMilimetros = compPolegadas * tamanhoPolegadas;
        System.out.printf("O comprimento em milímetros é: %.1f" , compMilimetros);

    }
}
