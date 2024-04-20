package LISTA7.Ex3;

public class Aluno {
    private Integer numMatricula;
    private String nome;
    private Double nota1;
    private Double nota2;
    public Aluno(){}
    public Aluno(Integer numMatricula,String nome, Double nota1, Double nota2){
        this.numMatricula = numMatricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Integer getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(Integer numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }
    public double media(){
        return (this.nota1 + this.nota2) / 2;
    }
    public boolean aprovado(){
        if (this.media() >= 7.0){
            return true;
        }
        else {
            return false;
        }
    }
    public double quantoFalta(){
        return 7 - this.media();
    }

    @Override
    public String toString() {
        return "Número da matrícula = " + this.getNumMatricula() + " | Nome: " + this.getNome() + " | Média do aluno = " + String.format("%.1f",this.media());
    }
}
