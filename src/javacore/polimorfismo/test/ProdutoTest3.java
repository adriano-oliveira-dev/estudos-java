package javacore.polimorfismo.test;

import javacore.polimorfismo.dominio.Computador;
import javacore.polimorfismo.dominio.Produto;
import javacore.polimorfismo.dominio.Tomate;
import javacore.polimorfismo.servico.CalcularImposto;

public class ProdutoTest3 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzem 5600",1000);
        CalcularImposto.calcularImposto(produto);

        System.out.println("---------------------------");

        Tomate tomate = new Tomate("Cereja",15);
        tomate.setDataDeValidade("11/10/2027");
        CalcularImposto.calcularImposto(tomate);

    }
}
