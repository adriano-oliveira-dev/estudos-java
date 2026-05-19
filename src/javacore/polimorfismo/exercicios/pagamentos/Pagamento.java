package javacore.polimorfismo.exercicios.pagamentos;

public class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public void processar(){
        System.out.println("Processando pagamento de R$: "+valor);
    }

    public double getValor() {
        return valor;
    }
}

