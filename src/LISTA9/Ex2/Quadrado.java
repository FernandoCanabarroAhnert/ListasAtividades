package LISTA9.Ex2;

public class Quadrado extends Quadrilatero{

    private Double lado;
    public Quadrado(Double lado) {
        super(lado,lado,lado,lado);
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

    @Override
    public double calcularPerimetro() {
        return this.getLado() * 4;
    }

    @Override
    public String toString() {
        return "Criando Quadrado com lado: " + String.format("%.2f",this.lado)
                + "\n- Área Quadrado = " + String.format("%.2f",this.calcularArea())
                + "\n- Perímetro Quadrado = " + String.format("%.2f",this.calcularPerimetro());
    }
}
