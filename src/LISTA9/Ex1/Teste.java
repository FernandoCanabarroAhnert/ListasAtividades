package LISTA9.Ex1;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com os dados do Rádio: ");
        System.out.print("Voltagem: ");
        int voltagem = ler.nextInt();
        System.out.print("AM: ");
        int am = ler.nextInt();
        System.out.print("FM: ");
        int fm = ler.nextInt();
        System.out.print("Banda: ");
        int banda = ler.nextInt();
        System.out.print("Sintonia: ");
        double sintonia = ler.nextDouble();
        System.out.print("Volume: ");
        int volume = ler.nextInt();
        Radio radio = new Radio(voltagem, am, fm, banda, sintonia, volume);

        System.out.println("Entre com os dados do Modelo 1 de TV: ");
        System.out.print("Voltagem: ");
        int voltagemM1 = ler.nextInt();
        System.out.print("Tamanho: ");
        int tamanhoM1 = ler.nextInt();
        Modelo1 modelo1 = new Modelo1(voltagemM1, tamanhoM1);

        System.out.println("Entre com os dados do Modelo 2 de TV: ");
        System.out.print("Voltagem: ");
        int voltagemM2 = ler.nextInt();
        System.out.print("Tamanho: ");
        int tamanhoM2 = ler.nextInt();
        Modelo2 modelo2 = new Modelo2(voltagemM2, tamanhoM2);

        int tipo;
        do {
            System.out.println("Você quer usar a TV1, a TV2 ou o Rádio (1/2/3)? Digite -1 para encerrar o programa");
            tipo = ler.nextInt();
            switch (tipo) {
                case 1:
                    imprimirMenu();
                    int op = ler.nextInt();
                    switch (op) {
                        case 1:
                            modelo1.ligar();
                            break;
                        case 2:
                            modelo1.desligar();
                            break;
                        case 3:
                            System.out.println("Para qual canal você deseja mudar? ");
                            int canal = ler.nextInt();
                            modelo1.mudarCanal(canal);
                            break;
                        case 4:
                            System.out.println("Quanto quer aumentar? ");
                            int aumentarM1 = ler.nextInt();
                            modelo1.aumentarVolume(aumentarM1);
                            break;
                        case 5:
                            System.out.println("Quanto quer diminuir? ");
                            int diminuirM1 = ler.nextInt();
                            modelo1.diminuirVolume(diminuirM1);
                            break;
                        default:
                            System.out.println("Opção inválida!Tente novamente");
                            break;
                    }
                    break;
                case 2:
                    imprimirMenu();
                    op = ler.nextInt();
                    switch (op) {
                        case 1:
                            modelo2.ligar();
                            break;
                        case 2:
                            modelo2.desligar();
                            break;
                        case 3:
                            System.out.println("Para qual canal você deseja mudar? ");
                            int canal = ler.nextInt();
                            modelo2.mudarCanal(canal);
                            break;
                        case 4:
                            System.out.println("Quanto quer aumentar? ");
                            int aumentarM2 = ler.nextInt();
                            modelo2.aumentarVolume(aumentarM2);
                            break;
                        case 5:
                            System.out.println("Quanto quer diminuir? ");
                            int diminuirM2 = ler.nextInt();
                            modelo2.diminuirVolume(diminuirM2);
                            break;
                        default:
                            System.out.println("Opção inválida!Tente novamente");
                            break;
                    }
                    break;
                case 3:
                    imprimirMenu();
                    op = ler.nextInt();
                    switch (op) {
                        case 1:
                            radio.ligar();
                            break;
                        case 2:
                            radio.desligar();
                            break;
                        case 3:
                            System.out.println("Para qual sintonia você deseja mudar? ");
                            int canal = ler.nextInt();
                            radio.mudarCanal(canal);
                            break;
                        case 4:
                            System.out.println("Quanto quer aumentar? ");
                            int aumentar = ler.nextInt();
                            radio.aumentarVolume(aumentar);
                            break;
                        case 5:
                            System.out.println("Quanto quer diminuir? ");
                            int diminuir = ler.nextInt();
                            radio.diminuirVolume(diminuir);
                            break;
                        default:
                            System.out.println("Opção inválida!Tente novamente");
                            break;
                    }
                    break;
                case -1:
                    System.out.println("Programa encerrado...");
                    break;
                default:
                    System.out.println("Opção inválida!Tente novamente...");
            }
        }while (tipo != -1) ;
    }
    private static void imprimirMenu(){
        System.out.println("1.Ligar");
        System.out.println("2.Desligar");
        System.out.println("3. Mudar de Canal");
        System.out.println("4. Aumentar Volume");
        System.out.println("5. Diminuir Volume");
        System.out.println("O que você deseja fazer? ");
    }
}
