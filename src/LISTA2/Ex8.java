package LISTA2;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite os valores dos lados do triângulo: ");
        System.out.print("Lado a: ");
        int a = ler.nextInt();
        System.out.print("Lado b: ");
        int b = ler.nextInt();
        System.out.print("Lado c: ");
        int c = ler.nextInt();

        if (a<b+c && b<a+b && c<a+b){
            System.out.println("Os valores formam um triângulo: ");
            if (a == b && b == c && c == a){
                System.out.println("EQUILÁTERO");
            } else if (a != b && b != c && c != a){
                System.out.println("ESCALENO");
            }else {
                System.out.println("ISÓSCELES");
            }
        } else{
            System.out.println("Os valores não formam um triângulo");
        }


    }
}
