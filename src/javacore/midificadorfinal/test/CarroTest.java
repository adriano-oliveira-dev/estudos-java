package javacore.midificadorfinal.test;

import javacore.midificadorfinal.dominio.Carro;
import javacore.midificadorfinal.dominio.Ferrari;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Ferrari ferrari = new Ferrari();

        System.out.println(carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Adriano");
        System.out.println(carro.COMPRADOR);

        ferrari.setNome("FERRARI");
        ferrari.imprime();


    }
}
