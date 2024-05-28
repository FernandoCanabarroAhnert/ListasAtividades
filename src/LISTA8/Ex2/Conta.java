package LISTA8.Ex2;

public class Conta {

    private Integer numero;

    private String nomeDoTitular;

    private Double saldo;

    public Conta(Integer numero,String nomeDoTitular){
        this.numero = numero;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = 0.0;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("--> Depósito de R$" + String.format("%.2f",valor));
        System.out.println(this);
    }

    public void sacar(double valor){
        System.out.println("--> Saque de R$" + String.format("%.2f",valor));
        if (valor > this.getSaldo()){
            System.out.println("Operação não realizada. Saldo insuficiente na Conta!");
        }
        else {
            this.setSaldo(this.getSaldo() - valor);
        }
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Conta " + this.getNumero() + "{Titular = " + this.getNomeDoTitular() + ", Saldo = R$" + String.format("%.2f",this.getSaldo()) + "}";
    }
}
