package javacore.exceptions.exercicios.contaBancaria;

public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(String message) {
        super(message);
    }

    public SaldoInsuficienteException() {
    }
}
