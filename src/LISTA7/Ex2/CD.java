package LISTA7.Ex2;

public class CD {
    private Integer numMusicasCD;
    private Integer faixaAtual;
    private String estado;
    public CD(){}
    public CD(Integer numMusicasCD,Integer faixaAtual,String estado){
        this.numMusicasCD = numMusicasCD;
        this.faixaAtual = faixaAtual;
        this.estado = estado;
    }

    public Integer getNumMusicasCD() {
        return numMusicasCD;
    }

    public void setNumMusicasCD(Integer numMusicasCD) {
        this.numMusicasCD = numMusicasCD;
    }

    public Integer getFaixaAtual() {
        return faixaAtual;
    }

    public void setFaixaAtual(Integer faixaAtual) {
        this.faixaAtual = faixaAtual;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void tocaCD(){
        System.out.println("Tocando faixa atual: " + this.getFaixaAtual());
        this.setEstado("Estado: tocando");
        System.out.println(this);
    }
    public void pausaCD(){
        System.out.println("Pausando a faixa atual: " + this.getFaixaAtual());
        this.setEstado("Estado: pausado");
        System.out.println(this);
    }
    public void paraCD(){
        System.out.println("Parando de tocar e voltando para a primeira faixa!");
        this.setFaixaAtual(1);
        this.setEstado("Estado: Faixa interrompida");
        System.out.println(this);
    }
    public void proximaFaixa(){
        if (this.getFaixaAtual() == this.getNumMusicasCD()){
            this.setFaixaAtual(1);
        }
        else {
            this.setFaixaAtual(this.getFaixaAtual() + 1);
        }
        System.out.println("Passando para a próxima faixa: " + this.getFaixaAtual());
        this.setEstado("Estado: tocando");
        System.out.println(this);
    }
    public void faixaAnterior(){
        if (this.getFaixaAtual() == 1){
            this.setFaixaAtual(this.getNumMusicasCD());
        }
        else {
            this.setFaixaAtual(this.getFaixaAtual() - 1);
        }
        System.out.println("Passando para a faixa anterior: " + this.getFaixaAtual());
        this.setEstado("Estado: tocando");
        System.out.println(this);
    }
    public String toString(){
        return this.getEstado() + " | Faixa atual: " + this.getFaixaAtual() + " | Número de músicas do CD: " + this.getNumMusicasCD();
    }
}
