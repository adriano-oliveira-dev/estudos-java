package javacore.polimorfismo.exercicios.pagamentos;

public class CartaoCredito extends Pagamento{
    private static final double TAXA_CARTAO = 0.02;
    public CartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public void processar() {
        super.processar();
        double valorFinal=0;
        System.out.println("Pagamneto no cartão,taxa de 2%: R$" + this.getValor() * TAXA_CARTAO);
        valorFinal = this.getValor() + (1 * TAXA_CARTAO);

        System.out.println("Valor total: R$"+valorFinal );
    }
}
