package javacore.polimorfismo.exercicios.pagamentos;

public class Boleto extends Pagamento{
    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public void processar() {
        super.processar();
        System.out.println("Boleto gerado com vencimento em 3 dias!");
    }
}
