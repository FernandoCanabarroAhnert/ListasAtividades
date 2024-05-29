package LISTA9.Ex1;

public class Modelo2 extends TV implements ControleRemoto{

    private String MODELO;

    public Modelo2(Integer voltagem, Integer tamanho) {
        super(voltagem, tamanho);
        this.MODELO = "Modelo 2";
    }

    public String getMODELO() {
        return MODELO;
    }

    public void setMODELO(String MODELO) {
        this.MODELO = MODELO;
    }

    @Override
    public void mudarCanal(int canal) {
        this.setCanal(canal);
        System.out.println("Mudando o canal do Moddelo 2! Canal atual: " + this.getCanal());
    }

    @Override
    public void aumentarVolume(int taxa) {
        if (this.getVolume() + taxa > 100) {
            this.setVolume(100);
        } else {
            this.setVolume(this.getVolume() + taxa);
        }
        System.out.println("Aumentando o Volume da TV1! Volume atual: " + this.getVolume());
    }

    @Override
    public void diminuirVolume(int taxa) {
        if (this.getVolume() - taxa < 0){
            this.setVolume(0);
        }
        else {
            this.setVolume(this.getVolume() - taxa);
        }
        System.out.println("Diminuindo o Volume da TV2! Volume atual: " + this.getVolume());
    }

    @Override
    public void ligar() {
        this.setLigada(true);
        System.out.println("TV2 - Modelo 2 está ligando!");
    }

    @Override
    public void desligar() {
        this.setLigada(false);
        System.out.println("TV2 - Desligando o Modelo 2!");
    }
}
