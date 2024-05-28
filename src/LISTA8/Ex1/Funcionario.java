package LISTA8.Ex1;

public class Funcionario {

    private String nome;

    private String cpf;

    private Double salario;

    public Funcionario(String nome,String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = 3500.00;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "-Nome: " + this.getNome()
                + "\n-CPF: " + this.getCpf()
                + "\n-Salário: R$" + String.format("%.2f",this.getSalario());
    }
}
