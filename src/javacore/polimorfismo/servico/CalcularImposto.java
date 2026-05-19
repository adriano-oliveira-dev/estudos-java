package javacore.polimorfismo.servico;
import javacore.polimorfismo.dominio.Produto;
import javacore.polimorfismo.dominio.Tomate;


public class CalcularImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto do produto");
        double imposto = produto.calcularImposto();
        System.out.println("Computador "+produto.getNome());
        System.out.println("Valor "+produto.getValor());
        System.out.println("Imposto a ser pago "+imposto);

        if(produto instanceof Tomate){
            String dataDeValidade = ((Tomate)produto).getDataDeValidade();
            System.out.println("Data De Validade: "+dataDeValidade);
        }

    }

}
