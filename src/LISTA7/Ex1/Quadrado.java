package LISTA7.Ex1;

public class Quadrado {

    private Double ladoDoQuadrado;
    public Quadrado(){}
    public Quadrado(Double ladoDoQuadrado){
        this.ladoDoQuadrado = ladoDoQuadrado;
    }

    public Double getLadoDoQuadrado() {
        return ladoDoQuadrado;
    }

    public void setLadoDoQuadrado(Double ladoDoQuadrado) {
        this.ladoDoQuadrado = ladoDoQuadrado;
    }
    public double getAreaQuadrado(){
        return Math.pow(this.ladoDoQuadrado,2);
    }
    public double getPerimetroQuadrado(){
        return this.ladoDoQuadrado * 4;
    }
    public double getDiagonalQuadrado(){
        return this.ladoDoQuadrado * Math.sqrt(2);
    }

    @Override
    public String toString() {
        return "Área = " + String.format("%.2f",getAreaQuadrado()) + " | Perímetro = " + String.format("%.2f",getPerimetroQuadrado()) + " | Diagonal = " + String.format("%.2f",getDiagonalQuadrado());
    }
}
