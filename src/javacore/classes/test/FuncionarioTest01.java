package javacore.classes.test;

import javacore.classes.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
       // double []salario = {1900,2000,2200};
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Adriano");
        funcionario.setIdade(28);
        funcionario.setSalarios(new double[]{1900,2200,2300});

        funcionario.dados();



    }
}
