package LISTA3;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String sexo;
        int idadeMTot = 0, idadeFTot = 0, qdeM = 0, qdeF = 0;
        do{
            System.out.println("Digite o sexo e a idade: ");
            System.out.println("Sexo: [M/F] ");
            sexo = ler.next();
            if (sexo.equalsIgnoreCase("M")){
                System.out.print("Idade: ");
                int idadeM = ler.nextInt();
                idadeMTot += idadeM;
                qdeM++;
            } else if (sexo.equalsIgnoreCase("F")){
                System.out.println("Idade: ");
                int idadeF = ler.nextInt();
                idadeFTot += idadeF;
                qdeF++;
            }
        } while (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F"));

        float mediaM = (float) idadeMTot / qdeM;
        float mediaF = (float) idadeFTot / qdeF;

        System.out.println("Quantidade de homens e a média de idade: " + qdeM + " homens e " + mediaM + " anos");
        System.out.println("Quantidade de mulheres e a média de idade: " + qdeF + " mulheres e " + mediaF + " anos");

    }
}
