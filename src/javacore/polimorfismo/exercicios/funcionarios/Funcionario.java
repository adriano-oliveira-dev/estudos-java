package javacore.polimorfismo.exercicios.funcionarios;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void trabalhar(){
        System.out.println("Funcionário Trabalhando: ");
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
