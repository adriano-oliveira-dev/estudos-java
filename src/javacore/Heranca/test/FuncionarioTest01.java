package javacore.Heranca.test;

import javacore.Heranca.dominio.Endereco;
import javacore.Heranca.dominio.Funcionario;
import javacore.Heranca.dominio.Pessoa;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        Pessoa pessoa1 = new Pessoa("Adriano");
        Funcionario funcionario = new Funcionario("Adriano",3800);

        endereco.setRua("Rua 5");
        endereco.setCep("55000-000");


        pessoa1.setIdade(21);
        pessoa1.setCpf("111.111.111-11");
        pessoa1.setEndereco(endereco);

        pessoa1.imprime();
        System.out.println("--------------------------");


        funcionario.setCpf("111.111.111-11");
        funcionario.setIdade(21);
        funcionario.setEndereco(endereco);

        funcionario.imprime();
    }
}
