package javacore.Heranca.test;

import javacore.Heranca.dominio.Carro;
import javacore.Heranca.dominio.Moto;

public class VeiculoTest {
    public static void main(String[] args) {
        Carro carro1 =new Carro("Chrevolet",2012,130,"Celta",2);
        Moto moto1 = new Moto("Honda",2022,130,"Titã",160);

        carro1.exibirInfo();
        System.out.println("--------------------------");
        moto1.exibirInfo();



    }
}
