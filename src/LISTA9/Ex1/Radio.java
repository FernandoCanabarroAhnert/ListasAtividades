package LISTA9.Ex1;

public class Radio extends Eletrodomestico implements ControleRemoto{

    private Integer AM;

    private Integer FM;

    private Integer banda;

    private Double sintonia;

    private Integer volume;

    public Radio(Integer voltagem,Integer AM,Integer FM,Integer banda,Double sintonia,Integer volume) {
        super(voltagem);
        this.AM = AM;
        this.FM = FM;
        this.banda = banda;
        this.sintonia = sintonia;
        this.volume = volume;
    }

    public Integer getAM() {
        return AM;
    }

    public void setAM(Integer AM) {
        this.AM = AM;
    }

    public Integer getFM() {
        return FM;
    }

    public void setFM(Integer FM) {
        this.FM = FM;
    }

    public Integer getBanda() {
        return banda;
    }

    public void setBanda(Integer banda) {
        this.banda = banda;
    }

    public Double getSintonia() {
        return sintonia;
    }

    public void setSintonia(Double sintonia) {
        this.sintonia = sintonia;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public void mudarCanal(int canal) {
        this.setSintonia((double) canal);
        System.out.println("Mudando a Sintonia do Rádio!");
        System.out.println(this);
    }

    @Override
    public void aumentarVolume(int taxa) {
        if (this.getVolume() + taxa > 100) {
            this.setVolume(100);
        } else {
            this.setVolume(this.getVolume() + taxa);
        }
        System.out.println("Aumentando o Volume do Rádio!");
        System.out.println(this);
    }

    @Override
    public void diminuirVolume(int taxa) {
        if (this.getVolume() - taxa < 0){
            this.setVolume(0);
        }
        else {
            this.setVolume(this.getVolume() - taxa);
        }
        System.out.println("Diminuindo o Volume do Rádio!");
        System.out.println(this);
    }

    @Override
    public void ligar() {
        System.out.println("Rádio ligado!");
        this.setLigada(true);
    }

    @Override
    public void desligar() {
        System.out.println("Rádio deligado!");
        this.setLigada(false);
    }

    @Override
    public String toString() {
        String estado = (this.isLigada()) ? "Ligado" : "Desligado";
        return "O Rádio está " + estado + ", Volume: " + this.getVolume() + " e Sintonia: " + this.getSintonia();
    }
}
