package javacore.enumeracao.test;

import javacore.enumeracao.dominio.Cliente;
import javacore.enumeracao.dominio.TipoCliente;
import javacore.enumeracao.dominio.TipoPagamento;
public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Adriano", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Adriano", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente3 = new Cliente("Adriano", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        Cliente cliente4 = new Cliente("Adriano", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
