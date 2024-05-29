package LISTA9.Ex1;

public class TV extends Eletrodomestico{

    private Integer tamanho;

    private Integer canal;

    private Integer volume;

    public TV(Integer voltagem,Integer tamanho) {
        super(voltagem);
        this.tamanho = tamanho;
        this.setCanal(1);
        this.setVolume(15);
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public Integer getCanal() {
        return canal;
    }

    public void setCanal(Integer canal) {
        this.canal = canal;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}
