package javacore.exceptions.exercicios.contaBancaria;

public class ContaBancaria{
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void sacar (double valorSaque) throws SaldoInsuficienteException {
            if(this.saldo < valorSaque){
                throw new SaldoInsuficienteException("saldo insuficiente! " +
                        "Valor em conta: " + this.saldo + " valor do saque: " + valorSaque );
            }
        System.out.println("saque de: "+valorSaque+" realizado com sucesso");
            this.saldo = this.saldo - valorSaque;
        System.out.println("Saldo em conta: "+this.saldo);
    }


}
