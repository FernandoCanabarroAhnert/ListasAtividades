package LISTA8.Ex1;

public class Gerente extends Funcionario{

    private String departamento;
    public Gerente(String nome, String cpf,String departamento) {
        super(nome, cpf);
        this.setSalario(this.getSalario() * 1.2);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "-Nome: " + this.getNome()
                + "\n-CPF: " + this.getCpf()
                + "\n-Salário: R$" + String.format("%.2f",this.getSalario())
                + "\n-Departamento: " + this.getDepartamento();
    }
}
