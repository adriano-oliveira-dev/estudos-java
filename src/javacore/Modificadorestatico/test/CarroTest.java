package javacore.Modificadorestatico.test;

import javacore.Modificadorestatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);

        Carro c1 =new Carro("Jaguar",275);
        Carro c2 =new Carro("BYD Dolphin",180);
        Carro c3 =new Carro("Celta",140);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }


}
