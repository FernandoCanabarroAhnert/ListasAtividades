package LISTA7.Ex2;

import java.util.Scanner;

public class TestaCD {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de músicas do cd: ");
        int numMusicasCD = ler.nextInt();
        CD cd = new CD(numMusicasCD);
        System.out.println("==== MENU ====");
        System.out.println("1 para PLAY");
        System.out.println("2 para PAUSE");
        System.out.println("3 para STOP");
        System.out.println("4 para ir para a PRÓXIMA FAIXA");
        System.out.println("5 para ir para a FAIXA ANTERIOR");
        int op;
        do {
            System.out.println("Digite uma opção ou -1 para encerrar o programa: ");
            op = ler.nextInt();
            switch (op){
                case 1:
                    cd.tocaCD();
                    break;
                case 2:
                    cd.pausaCD();
                    break;
                case 3:
                    cd.paraCD();
                    break;
                case 4:
                    cd.proximaFaixa();
                    break;
                case 5:
                    cd.faixaAnterior();
                    break;
                case -1:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Valor inválido!Tente novamente!");
            }
        } while (op != -1);
    }
}
