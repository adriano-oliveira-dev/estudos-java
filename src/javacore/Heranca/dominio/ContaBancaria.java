package javacore.Heranca.dominio;

public class ContaBancaria {
    protected double saldo = 0;
    protected String titular;

    public ContaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void exibirInfo(){
        System.out.println("Titular: "+this.titular);
        System.out.println("Saldo em conta: R$"+this.saldo);

    }

    public void depositar(double valor){
        this.saldo = valor + this.saldo;
        System.out.println("Deposito de R$"+valor+" realizado com sucesso");
    }

    public void exibirSaldo(){
        System.out.printf("Seu saldo é: "+this.saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
