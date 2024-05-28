package LISTA8.Ex4;

public class Moeda {

    private String nome;

    private Double valor;

    public Moeda(String nome,Double valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
