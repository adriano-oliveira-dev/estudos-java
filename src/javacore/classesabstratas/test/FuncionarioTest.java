package javacore.classesabstratas.test;

import javacore.classesabstratas.dominio.Desenvolvedor;
import javacore.classesabstratas.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Adriano",9000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Adriano",10000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

        gerente.imprime();
        desenvolvedor.imprime();
    }
}
