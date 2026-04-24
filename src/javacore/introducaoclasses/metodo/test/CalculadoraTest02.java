package javacore.introducaoclasses.metodo.test;

import javacore.introducaoclasses.metodo.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divdeDoisNumeros(20,10);
        System.out.println(result);
    }
}
