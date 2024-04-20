package DESAFIO;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num_linhas = 5,num_colunas = 5;//atribuir o tamanho de linhas e colunas da matriz em 2 variáveis;
        int[][] matriz = null;//declaração da matriz;
        matriz = gerarMatriz(num_linhas,num_colunas);//método que cria uma matriz com números aleatórios,inteiros, com valores positivos e negativos;
        imprimirMatriz(matriz);//método que imprime a matriz no console;
        imprimirMenu();//imprime o menu com as opções de escolha do usuário;
        int op;//declaração da variavel responsável por armazenar a resposta do usuário,que será atribuida dentro do escopo DO-WHILE;
        do {
            System.out.println("---------------------------------------");
            System.out.println("Digite uma das opções ou -1 para encerrar o programa: ");
            op = ler.nextInt();
            //os métodos serão explicados mais abaixo,após o escopo do método Main;
            switch (op) {//de acordo com a escolha do usuário,a estrutura SWITCH será percorrida até que a condição seja satisfeita;
                case 1:
                    somaLinhaPar(matriz);
                    break;
                case 2:
                    somaColunaImpar(matriz);
                    break;
                case 3:
                    somaDiagonalPrincipal(matriz);
                    break;
                case 4:
                    mediaMatriz(matriz);
                    break;
                case 5:
                    qdeNegativos(matriz);
                    break;
                case 6:
                    diagPrincipalMultiplicadaMediaDiagSecundaria(matriz);
                    break;
                case -1://opção que encerra o programa;
                    System.out.println("Programa encerrado!");
                    break;
                default://caso algum número diferente das opções possiveis seja digitado,exceto pelo -1,a mensagem abaixo aparecerá;
                    System.out.println("Opção inválida!Tente novamente! ");
                    break;
            }
        }while (op != -1);//condição da estrutura de repetição DO-WHILE
    }
    public static int[][] gerarMatriz(int linhas,int colunas){
        //o método recebe dois valores inteiros, que serão,respectivamente, a quantidade de linhas e colunas
        //da matriz.Ele retorna uma matriz 5 x 5;
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                double ale = 10 + Math.random() * -20;
                matriz[i][j] = (int) ale;
            }
        }
        return matriz;
    }
    public static void imprimirMatriz(int[][] matriz){
        //o método recebe uma matriz de inteiros e imprime a mesma;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void imprimirMenu(){
        //método que imprime as escolhas possíveis do usuário;
        System.out.println("=== MENU ===");
        System.out.println("1) a soma dos elementos de todas as linhas pares da matriz");
        System.out.println("2) a soma dos elementos de todas as colunas ímpares da matriz");
        System.out.println("3) a soma dos elementos da diagonal principal");
        System.out.println("4) a média de todos os elementos da matriz.");
        System.out.println("5) a quantidade de elementos negativos da matriz.");
        System.out.println("6) o resultado da multiplicação dos elementos da diagonal principal com a média dos elementos da diagonal secundária.");
    }
    public static void somaLinhaPar(int[][] matriz){
        //o método recebe como parâmetro uma matriz de inteiros
        //o laço FOR percorrerá todas as colunas, mas somente as linhas pares, ou seja,
        //as linhas 0,2 e 4(levando em consideração que um Array começa com 0,e não com 1;
        int somaLinhasPares = 0;//variável que armazenará a soma de todos os elementos das linhas pares
        for (int i = 0; i < matriz.length; i += 2) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinhasPares += matriz[i][j];
            }
        }
        System.out.println("A soma dos elementos de todas as linhas pares da matriz = " + somaLinhasPares);
    }
    public static void somaColunaImpar(int[][] matriz){
        //o método recebe como parâmetro uma matriz de inteiros
        //o laço FOR percorrerá todas as linhas, mas somente as colunas impares, ou seja,
        //as colunas 1 e 3(levando em consideração que um Array começa com 0,e não com 1;
        int somaColunasImpares = 0;//variável que armazenará a soma de todos os elementos das colunas impares
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j += 2) {
                somaColunasImpares += matriz[i][j];
            }
        }
        System.out.println("Soma dos elementos de todas as colunas ímpares da matriz = " + somaColunasImpares);
    }
    public static void somaDiagonalPrincipal(int[][] matriz){
        //o método recebe como parâmetro uma matriz de inteiros;
        //o laço for percorrerá o tamanho da matriz,sem a necessidade de outro laço for dentro do escopo do
        //primeiro laço for.Se o valor da linha e da coluna forem iguais,ou seja,matriz[i][i],o valor será adicionado a uma
        //variável
        int somaDiagPrincipal = 0;//variável que armazenará a soma dos valores da diagonal principal
        for (int i = 0; i < matriz.length; i++) {
            somaDiagPrincipal += matriz[i][i];
        }
        System.out.println("Soma dos elementos da diagonal principal = " + somaDiagPrincipal);
    }
    public static void mediaMatriz(int[][] matriz){
        //o método recebe como parâmetro uma matriz de inteiros;
        //o laço for percorrerá todas as posições da matriz 5 x 5 e agregará cada valor em uma variável;
        //depois de somar todos os valores,a soma total será dividida por 25,resultando na média;
        double somaTotal = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaTotal += matriz[i][j];
            }
        }
        double media = somaTotal / Math.pow(matriz.length, 2);
        System.out.println("Média de todos os elementos da matriz = " + media);
    }
    public static void qdeNegativos(int[][] matriz){
        //o método recebe como parâmetro uma matriz de inteiros;
        //o laço for percorrerá todas as posições da matriz 5 x 5, e caso encontre um valor negativo,
        //a variável responsável por armazenar a quantidade de elementos negativos será incrementada com +1
        int qdeNegativos = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    qdeNegativos++;
                }
            }
        }
        System.out.println("Quantidade de elementos negativos da matriz = " + qdeNegativos);
    }
    public static void diagPrincipalMultiplicadaMediaDiagSecundaria(int[][] matriz){
        //o método recebe como parâmetro uma matriz de inteiros;
        //1o)O primeiro laço for percorrerá toda a matriz de 5 por 5. Caso a soma da posição de um elemento seja
        //o tamanho da matriz - 1, isto é, i + j == matriz.length - 1, o valor está posicionado na linha da diagonal
        //secundária. O valor encontrado será armazenado em uma variável de soma;
        double somaDiagSecundaria = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == matriz.length - 1) {
                    somaDiagSecundaria += matriz[i][j];
                }
            }
        }
        double mediaDiagSecundaria = somaDiagSecundaria / matriz.length;//média dos elementos da diagonal secundária
        System.out.println("Multiplicação dos elementos da diagonal principal com a média dos elementos da diagonal secundária = ");
        System.out.print("|");
        for (int i = 0; i < matriz.length; i++) {
            //seguindo a mesma lógica de uma das opções anteriores, caso um valor que esteja posicionado na
            //diagonal principal seja encontrado, o mesmo será multiplicado pela média da diagonal secundária e será imprimido
            //no terminal
            System.out.printf(" %.1f |",matriz[i][i] * mediaDiagSecundaria);
        }
        System.out.println();
    }
}
