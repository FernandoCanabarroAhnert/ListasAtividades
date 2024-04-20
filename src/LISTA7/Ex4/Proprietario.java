package LISTA7.Ex4;

public class Proprietario {
    private String nome;
    private String endereco;
    private char sexo;
    private String CPF;
    private String CNH;
    public Proprietario(){}
    public Proprietario(String nome,String endereco,char sexo,String CPF,String CNH){
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.CPF = CPF;
        this.CNH = CNH;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }


    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " | Endereço: " + this.getEndereco() + " | Sexo: " + this.getSexo() + " | CPF: " + this.getCPF() + " | CNH: " + this.getCNH();
    }
}
