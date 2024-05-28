package LISTA8.Ex2;

public class ContaCorrente extends Conta{

    private Double limite;
    public ContaCorrente(Integer numero, String nomeDoTitular) {
        super(numero, nomeDoTitular);
        this.setSaldo(1000.00);
        this.limite = 500.00;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor){
        System.out.println("--> Saque de R$" + String.format("%.2f",valor));
        if (valor > this.getSaldo() + this.getLimite()){
            System.out.println("Operação não realizada. Saldo insuficiente na Conta!");
        }
        else {
            this.setSaldo(this.getSaldo() - valor);
        }
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Conta " + this.getNumero() + " {Titular = " + this.getNomeDoTitular()
                + ", Saldo = R$" + String.format("%.2f",this.getSaldo()) + "(Limite = R$" + String.format("%.2f",this.getLimite()) + ") }";
    }
}
