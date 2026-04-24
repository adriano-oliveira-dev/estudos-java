package javacore.metodos.dominio;

import java.util.Scanner;

public class Calculadora {
    public void somaDoisNumero(){
        int num1;
        int num2;
        int soma;
        Scanner scn = new Scanner(System.in);
        System.out.println("digite um numero: ");
        num1 = scn.nextInt();
        System.out.println("digite mais um numero: ");
        num2 = scn.nextInt();
        soma =  num1 + num2;
        System.out.println("A soma é: " +soma);

    }

    public void divisaoDoisNumero(){

        int num1;
        int num2;
        int divisao;
        Scanner scn = new Scanner(System.in);
        System.out.println("digite um numero: ");
        num1 = scn.nextInt();
        System.out.println("digite mais um numero: ");
        num2 = scn.nextInt();
        divisao =  num1 / num2;
        System.out.println("A divisão é: " +divisao);

    }

    public void subtracao(int num1, int num2){
        double subtracao = num1 - num2;
        System.out.println(subtracao);

    }

    public double divdeDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;

        }

        return num1/num2;

    }

    public void somaArray(int[] numeros){
        int soma=0;
        for (int num : numeros) {
            soma +=num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma=0;
        for (int num : numeros) {
            soma +=num;
        }
        System.out.println(soma);
    }


}
