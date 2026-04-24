package javacore.classes.test;

import javacore.classes.dominio.Estudante;

import java.util.Scanner;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Estudante estudante = new Estudante();

        System.out.println("\ndigite o nome do estudante :");
        estudante.nome =scn.next();

       System.out.println("\ndigite a idade :");
         estudante.idade = scn.nextInt();

        System.out.println("\ndigite o sexo :");
        estudante.sexo = scn.next().charAt(0);


        System.out.println("Nome: "+estudante.nome);
        System.out.println("Idade: "+estudante.idade);
        System.out.println("sexo: "+estudante.sexo);



    }
}
