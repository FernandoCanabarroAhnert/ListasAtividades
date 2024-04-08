package LISTA2;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float precoBan = 0.30f, precoLar = 0.40f, precoMaca = 0.50f, precoKiwi = 0.40f;
        int produto, qdeProduto;
        System.out.println("---- LISTA DE PRODUTOS E PREÇOS ----");
        System.out.println("1 - Banana -> R$0.30 a unidade ou R$0.25 a unidade por dúzia");
        System.out.println("2 - Laranja -> R$0.40 a unidade ou R$0.35 a unidade por dúzia");
        System.out.println("3 - Maçã -> R$0.50 a unidade ou R$0.45 a unidade por dúzia");
        System.out.println("4 - Kiki -> R$0.40 a unidade ou R$0.30 a unidade por dúzia");

        System.out.println("Escolha o produto que deseja comprar: ");
        produto = ler.nextInt();

        System.out.println("Digite a quantidada do produto que você deseja comprar: ");
        qdeProduto = ler.nextInt();
        if (qdeProduto >= 12){
            precoBan = 0.25f;
            precoLar = 0.35f;
            precoMaca = 0.45f;
            precoKiwi = 0.30f;
        }

        System.out.println("---- VALOR DA COMPRA ----");

        switch(produto){
            case 1:
                System.out.printf("%d unidade(s) de banana a R$%.2f a unidade = R$%.2f\n",qdeProduto, precoBan, qdeProduto * precoBan);
                break;
            case 2:
                System.out.printf("%d unidade(s) de laranja a R$%.2f a unidade = R$%.2f\n",qdeProduto, precoLar , qdeProduto * precoLar);
                break;
            case 3:
                System.out.printf("%d unidade(s) de maçã a R$%.2f a unidade = R$%.2f\n", qdeProduto, precoMaca, qdeProduto * precoMaca);
                break;
            case 4:
                System.out.printf("%d unidade(s) de kiwi a R$%.2f a unidade = R$%.2f\n", qdeProduto, precoKiwi, qdeProduto * precoKiwi);
                break;
            default:
                System.out.println("Valores inválidos");

        }


    }
}
