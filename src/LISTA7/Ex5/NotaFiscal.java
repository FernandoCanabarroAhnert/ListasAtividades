package LISTA7.Ex5;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {

    private List<ItemNotaFiscal> produtos = new ArrayList<>();

    public NotaFiscal(List<ItemNotaFiscal> produtos) {
        this.produtos = produtos;
    }

    public List<ItemNotaFiscal> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ItemNotaFiscal> produtos) {
        this.produtos = produtos;
    }

    public double calculaTotal(){
        return produtos.stream().map(ItemNotaFiscal::valorTotal).reduce(0.0, Double::sum);
    }

    public void mostrar(){
        int cont = 1;
        for (ItemNotaFiscal x : produtos){
            System.out.println("ITEM " + cont + ":");
            System.out.println(x);
            System.out.println("---------------------------------");
            cont++;
        }
    }
}
