package javacore.exceptions.excepition.test;

import javacore.exceptions.dominio.Funcionario;
import javacore.exceptions.dominio.LoginInvalidoException;
import javacore.exceptions.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
