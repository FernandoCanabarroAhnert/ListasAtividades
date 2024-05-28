package LISTA8.Ex3;

public abstract class CFuncionario {

    private String nome;

    private String cpf;

    public CFuncionario(String nome,String cpf){
        this.nome = nome;
        this.cpf = cpf;
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

    public abstract double calculaRendimento();

    @Override
    public String toString() {
        return "-Nome = " + this.getNome()
                + "\n-CPF = " + this.getCpf()
                + "\n-Rendimento Mensal = R$" + String.format("%.2f",this.calculaRendimento());
    }
}
