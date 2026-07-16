package javacore.exceptions.exercicios.calculadora;

public class Calculadora {

    public void dividir(double a, double b)  {
        if(b == 0){
            throw new ArithmeticException("Não é possivel dividir por zero!");
        }
        double divisao = a/b;

        System.out.println("Resultado: "+divisao);



    }

}
