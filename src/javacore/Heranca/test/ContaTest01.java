package javacore.Heranca.test;

import javacore.Heranca.dominio.ContaCorrente;
import javacore.Heranca.dominio.ContaPoupanca;

public class ContaTest01 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(2000,"Adriano",1500);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2000,"Adriano",0.01);

        contaCorrente.exibirInfo();
        contaCorrente.sacar(3500);
        System.out.println("-----------------------");
        contaPoupanca.exibirInfo();
        contaPoupanca.depositar(1000);
        contaPoupanca.render();
        contaPoupanca.exibirInfo();

    }
}
