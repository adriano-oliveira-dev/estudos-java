package javacore.exceptions.excepition.test;

import javacore.exceptions.dominio.LoginInvalidoException;

import java.util.Scanner;

public class loginInvalidoExceptionTest {
    public static void main(String[] args) throws LoginInvalidoException {
        logar();
    }
    private static void logar() throws LoginInvalidoException{
        Scanner scn =new Scanner(System.in);
        String usarnameDB = "Adriano";
        String senhaDB = "9090";

        System.out.println("Usuário");
        String usernameDigitado = scn.nextLine();

        System.out.println("Senha");
        String senhaDigitada = scn.nextLine();

        if(!usernameDigitado.equals(usarnameDB) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuário e/ou Senha invalidos");
        }
        System.out.println("Login efetuado com sucesso");

    }
}
