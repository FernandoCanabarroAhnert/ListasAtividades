package LISTA7.Ex3;

import java.util.Scanner;

public class TestaAluno {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o número da matrícula do aluno: ");
        int numMatricula = ler.nextInt();
        System.out.print("Digite o nome do aluno: ");
        ler.nextLine();
        String nome = ler.nextLine();
        System.out.println("Digite as 2 notas:");
        System.out.print("Nota 1: ");
        double nota1 = ler.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = ler.nextDouble();
        Aluno aluno = new Aluno(numMatricula,nome,nota1,nota2);
        System.out.printf("Média do aluno = %.1f\n",aluno.media());
        System.out.println("Aprovado: " + aluno.aprovado());
        if (!aluno.aprovado()){
            System.out.println("REPROVADO!");
            System.out.printf("Pontos necessários para passar = %.1f\n" , aluno.quantoFalta());
        }
        else {
            System.out.println("PARABÉNS!!!");
        }
        System.out.println(aluno);
    }
}
