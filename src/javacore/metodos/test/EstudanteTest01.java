package javacore.metodos.test;

import javacore.metodos.dominio.Estudante;
import javacore.metodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome="Adriano";
        estudante01.idade=28;
        estudante01.sexo='M';

        estudante02.nome="Adriana";
        estudante02.idade=27;
        estudante02.sexo='F';

        impressora.imprime(estudante01);
        System.out.println("---------------------------");
        impressora.imprime(estudante02);
    }
}
