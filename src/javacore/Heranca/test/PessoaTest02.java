package javacore.Heranca.test;

import javacore.Heranca.dominio.Aluno;
import javacore.Heranca.dominio.Professor;

public class PessoaTest02 {
    public static void main(String[] args) {
        Professor professor =new Professor("Adriano",21,"Português");
        Aluno aluno =new Aluno("Adriano",22,"12345678");

        professor.exibirInfo();
        System.out.println("------------------");
        aluno.exibirInfo();
    }
}
