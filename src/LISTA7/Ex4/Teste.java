package LISTA7.Ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Proprietario p1 = new Proprietario("Fernando","Uniritter - FAPA",'M',"123.456.789-10","123456789");
        Proprietario p2 = new Proprietario("William","UFRGS",'M',"109.876.543-21","987654321");

        Veiculo v1 = new Veiculo("IYO-1826","Preto","Logan",p1);
        Veiculo v2 = new Veiculo("ABC-1234","Azul","Onix",p1);
        Veiculo v3 = new Veiculo("DEF-5678","Vermelho","Prisma",p1);
        Veiculo v4 = new Veiculo("GHI-9101","Branco","Spin",p2);
        Veiculo v5 = new Veiculo("JKL-1121","Cinza","Mercedes",p2);

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.addAll(Arrays.asList(v1,v2,v3,v4,v5));
        veiculos.forEach(System.out::println);

    }
}
