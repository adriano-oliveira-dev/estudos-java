package javacore.introducaoclasses.classes.test;

import javacore.introducaoclasses.classes.dominio.Carro;

public class TestCarro01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();


        carro1.nome = "celta";
        carro1.modelo ="hatch";
        carro1.ano =2012;

        carro2.nome = "corola";
        carro2.modelo ="sedan";
        carro2.ano =2016;

        System.out.println("nome: "+carro1.nome+", ano: "+carro1.ano+", modelo: "+carro1.modelo);

        System.out.println("--------------------------------------------------------------------");

        System.out.println("nome: "+carro2.nome+", ano: "+carro2.ano+", modelo: "+carro2.modelo);



    }
}
