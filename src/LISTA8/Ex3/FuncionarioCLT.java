package LISTA8.Ex3;

public class FuncionarioCLT extends CFuncionario{

    public Double salarioMensal;

    public FuncionarioCLT(String nome, String cpf,Double salarioMensal) {
        super(nome, cpf);
        this.salarioMensal = salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calculaRendimento() {
        return this.salarioMensal;
    }
}
