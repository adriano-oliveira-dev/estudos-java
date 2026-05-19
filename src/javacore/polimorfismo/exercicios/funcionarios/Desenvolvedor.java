package javacore.polimorfismo.exercicios.funcionarios;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar() {
        super.trabalhar();
        System.out.println("Desenvolvendo código! ");
    }
    public void fazerCodReviw(){
        System.out.println("Executando code reviw! ");
    }
}
