package javacore.classes.test;

import javacore.classes.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Adriano");
        pessoa.setIdade(28);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());


    }

}
