package LISTA8.Ex4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cofrinho {

    private List<Moeda> moedas = new ArrayList<>();

    public Cofrinho() {
    }

    public List<Moeda> getMoedas() {
        return moedas;
    }

    public void adicionarMoeda(Moeda moeda){
        moedas.add(moeda);
        System.out.println("Adicionando R$" + String.format("%.2f",moeda.getValor()) + " ao cofrinho...");
        System.out.println(this);
    }

    public double calcularTotal(){
        return moedas.stream().map(Moeda::getValor).reduce(0.0,Double::sum);
    }

    public void retirarMoeda(Moeda moeda){
        System.out.println("Retirando R$" + String.format("%.2f",moeda.getValor()) + " do cofrinho...");
        if (this.calcularTotal() < moeda.getValor()){
            System.out.println("Impossível retirar moeda! Total insuficiente...");
        }
        else if(!moedas.contains(moeda)){
            System.out.println("Esta moeda não está dentro do cofrinho!");
        }
        else {
            moedas.remove(moeda);
        }
        System.out.println(this);
    }

    public int quantidadeDeMoedas(){
        return moedas.size();
    }

    public void moedasPresentes(){
        List<Moeda> lista = moedas.stream().sorted(Comparator.comparing(Moeda::getValor).reversed()).toList();
        System.out.println("--------------");
        System.out.println("Moedas dentro do cofrinho:");
        lista.forEach(System.out::println);
        System.out.println("--------------");
    }

    @Override
    public String toString() {
        if (quantidadeDeMoedas() == 0){
            return "Cofre Vazio!";
        }
        else {
            return "Total: R$" + String.format("%.2f", this.calcularTotal());
        }
    }
}
