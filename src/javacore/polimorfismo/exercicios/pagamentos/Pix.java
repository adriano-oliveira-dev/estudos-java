package javacore.polimorfismo.exercicios.pagamentos;

public class Pix extends Pagamento{
    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void processar() {
        super.processar();
        System.out.println("Pix aprovado instataneamente!");
    }
}
