package javacore.Heranca.dominio;

public class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(double saldo, String titular, double limite) {
        super(saldo, titular);
        this.limite = limite;
    }

    public void exibirInfo(){
        super.exibirInfo();
        double limiteTotal = saldo + this.limite;
        System.out.println("Limite de credito disponivel: R$"+limite);
        System.out.println("Valor total disponivel para saque: R$" + limiteTotal );
    }

    public void sacar(double valor){
        double limiteTotal = limite + saldo;
        if (valor >limiteTotal || valor <0 ){
            System.out.println("Você não tem limite suficiente ou valor incompativel");
        }else {
            limiteTotal = limiteTotal - valor;
            System.out.println("Saque de R$"+valor+" efetuado com sucesso!");
            System.out.println("Limite para saque disponivel no momento é : R$"+limiteTotal);
        }
    }
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
