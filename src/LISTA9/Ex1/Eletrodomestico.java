package LISTA9.Ex1;

public abstract class Eletrodomestico {

    private Boolean ligada;

    private Integer voltagem;

    public Eletrodomestico(Integer voltagem){
        this.ligada = false;
        this.voltagem = voltagem;
    }

    public Boolean isLigada() {
        return ligada;
    }

    public void setLigada(Boolean ligada) {
        this.ligada = ligada;
    }

    public Integer getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(Integer voltagem) {
        this.voltagem = voltagem;
    }
}
