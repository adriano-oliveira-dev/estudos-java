package javacore.exceptions.exercicios;


import javacore.exceptions.exercicios.contaBancaria.ContaBancaria;
import javacore.exceptions.exercicios.contaBancaria.SaldoInsuficienteException;

public class Main {
    public static void main(String[] args) {
        /*Calculadora c1 = new Calculadora();

        try {
            c1.dividir(10,0);
        }catch (ArithmeticException exception){
            System.out.println("O divisor não pode ser zero!");
            exception.printStackTrace();
        }finally {
            System.out.println("operação finalizada");
        }*/
        /*Dados d = new Dados();
        try {
            d.processarDados(null, 0, "123");
            }catch (NullPointerException exception) {
                System.out.println("Array nãopode ser nullo");
            }
        try {
                d.processarDados(new String[]{"a", "b", "c"}, 4, "123");
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Índice inválido ");
            }

        try {
                d.processarDados(new String[]{"a", "b", "c"}, 0, "abc");
            }catch (NumberFormatException numberFormatException) {
                System.out.println("Texto de número inválido");
            }*/


        ContaBancaria contaBancaria = new ContaBancaria(1000);

        try {
            contaBancaria.sacar(1100);
        }catch (SaldoInsuficienteException exception){
            exception.printStackTrace();
        }
        try{
            contaBancaria.sacar(900);
        }catch (SaldoInsuficienteException exception){
            exception.printStackTrace();
        }





    }
}
