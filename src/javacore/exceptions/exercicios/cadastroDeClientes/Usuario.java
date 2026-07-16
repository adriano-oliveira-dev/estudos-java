package javacore.exceptions.exercicios.cadastroDeClientes;

public class Usuario {
    private String nome;
    private int idade;

    public Usuario(String nome, int idade) {
        if (idade<0 || idade>150){
            throw new IdadeInvalidaException("idade inválida: " +idade);
        }
        this.nome = nome;
        this.idade = idade;
        System.out.println("cadastro realizado com sucesso");

    }
}
