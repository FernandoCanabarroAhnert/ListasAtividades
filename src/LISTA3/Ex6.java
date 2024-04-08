package LISTA3;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int contador = 0;
        int numeroAtual = 101;

        while (contador < 50) {
            boolean ehPrimo = true;
            for (int i = 2; i <= Math.sqrt(numeroAtual); i++) {
                if (numeroAtual % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.println(numeroAtual);
                contador++;
            }
            numeroAtual++;
        }

    }
}
