package javacore.Heranca.test;

import javacore.Heranca.dominio.Funcionario02;
import javacore.Heranca.dominio.Gerente02;

public class FuncionarioTest02 {
    public static void main(String[] args) {
        Funcionario02 funcionario02 = new Funcionario02("Adriano","111.111.111-11",3000);
        Gerente02 gerente02 = new Gerente02("Adriano","111.111.111-11",5000, "Desenvolvimento");

        funcionario02.exibirInfo();
        funcionario02.calcularBonus();
        System.out.println("-------------------------");
        gerente02.exibirInfo();
        gerente02.calcularBonus();
    }
}
