package LISTA7.Ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<ItemNotaFiscal> lista = new ArrayList<>();
        System.out.print("Quantos items serão comprados? ");
        int n = ler.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Entre com os dados do item #" + (i+1) + ":");
            System.out.print("Descrição: ");
            ler.nextLine();
            String descricao = ler.nextLine();
            System.out.print("Valor unitário: ");
            double valorUnid = ler.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = ler.nextInt();
            System.out.print("Alíquota: ");
            double aliquota = ler.nextDouble();
            lista.add(new ItemNotaFiscal(descricao,valorUnid,quantidade,aliquota));
            System.out.println("---------------------------------------");
        }
        System.out.println("===========================");
        for (int i = 0; i < n; i++) {
            System.out.println("ITEM " + (i + 1) + ":");
            System.out.println(lista.get(i));
            System.out.println("---------------------------------");
        }
    }
}
