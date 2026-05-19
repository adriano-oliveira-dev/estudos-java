package javacore.polimorfismo.test;

import javacore.polimorfismo.dominio.Computador;
import javacore.polimorfismo.dominio.Televisao;
import javacore.polimorfismo.dominio.Tomate;
import javacore.polimorfismo.servico.CalcularImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("Acer Nitro",4900);
        Tomate tomate = new Tomate("Tomate cereja",12);
        Televisao tv = new Televisao("LG 55",3500);

        CalcularImposto.calcularImposto(computador);
        System.out.println("---------------------------------");
        CalcularImposto.calcularImposto(tv);
        System.out.println("---------------------------------");
        CalcularImposto.calcularImposto(tomate);


    }
}
