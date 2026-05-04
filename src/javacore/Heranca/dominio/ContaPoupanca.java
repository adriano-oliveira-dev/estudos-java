package javacore.Heranca.dominio;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(double saldo, String titular, double taxaRendimento) {
        super(saldo, titular);
        this.taxaRendimento = taxaRendimento;
    }


    public void render(){
        double rendimento = saldo * this.taxaRendimento;
        saldo = saldo + rendimento;
        System.out.println("Taxa de rendimento ao mes é de: " + taxaRendimento * 100 + "%");
        System.out.println("O rendimento do seu saldo é: R$"+rendimento+" este mês");
        System.out.println("Valor do saldo + rendimento é: R$"+saldo);
    }
    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}
