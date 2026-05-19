package javacore.polimorfismo.testexercicios;

import javacore.polimorfismo.exercicios.funcionarios.Desenvolvedor;
import javacore.polimorfismo.exercicios.funcionarios.Designer;
import javacore.polimorfismo.exercicios.funcionarios.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioTest {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Desenvolvedor("Adriano", 4000));
        funcionarios.add(new Designer("Adriana", 4000));

        for (Funcionario funcionario : funcionarios) {
            funcionario.trabalhar();
            if (funcionario instanceof Desenvolvedor) {
                ((Desenvolvedor) funcionario).fazerCodReviw();
                System.out.println("---------------------------");
            }
            if (funcionario instanceof Designer) {
                ((Designer) funcionario).criarPrototipo();
                System.out.println("---------------------------");


            }
        }
    }
}
