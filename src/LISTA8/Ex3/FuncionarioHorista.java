package LISTA8.Ex3;

public class FuncionarioHorista extends CFuncionario{

    public Double salarioHora;

    public Integer horasTrabalhadas;

    public FuncionarioHorista(String nome, String cpf,Double salarioHora,Integer horasTrabalhadas) {
        super(nome, cpf);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas= horasTrabalhadas;
    }

    public Double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(Double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calculaRendimento() {
        return this.getHorasTrabalhadas() * this.getSalarioHora();
    }
}
