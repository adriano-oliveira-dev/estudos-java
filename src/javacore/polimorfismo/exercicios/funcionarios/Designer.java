package javacore.polimorfismo.exercicios.funcionarios;

public class Designer extends Funcionario{
    public Designer(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar() {
        super.trabalhar();
        System.out.println("Criando layouts! ");
    }
    public void criarPrototipo (){
        System.out.println("Criando prototipo!  ");
    }
}
