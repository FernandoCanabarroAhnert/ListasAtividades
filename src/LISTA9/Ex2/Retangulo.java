package LISTA9.Ex2;

public class Retangulo extends Quadrilatero{

    private Double base;

    private Double altura;

    public Retangulo(Double base,Double altura) {
        super(base,base,altura,altura);
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.getBase() * this.getAltura();
    }

    @Override
    public double calcularPerimetro() {
        return this.getBase() * 2 + this.getAltura() * 2;
    }

    @Override
    public String toString() {
        return "Criando Quadrado com base: " + String.format("%.2f",this.getBase()) + " e altura: " + String.format("%.2f",this.getAltura())
                + "\n- Área Quadrado = " + String.format("%.2f",this.calcularArea())
                + "\n- Perímetro Quadrado = " + String.format("%.2f",this.calcularPerimetro());
    }
}
