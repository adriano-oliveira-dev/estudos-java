package javacore.polimorfismo.testexercicios;

import javacore.polimorfismo.exercicios.pagamentos.Boleto;
import javacore.polimorfismo.exercicios.pagamentos.CartaoCredito;
import javacore.polimorfismo.exercicios.pagamentos.Pagamento;
import javacore.polimorfismo.exercicios.pagamentos.Pix;

public class TestPagamento {

    public static void efetuarPagamento(Pagamento pagamento){
        pagamento.processar();
    }

    public static void main(String[] args) {
        efetuarPagamento(new CartaoCredito(800));
        System.out.println("----------------------");
        efetuarPagamento(new Boleto(700));
        System.out.println("----------------------");
        efetuarPagamento(new Pix(600));




    }
}
