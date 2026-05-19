package javacore.polimorfismo.exercicios.animais;

public class Animal{

    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom(){
        System.out.println("Som generico!!!");
    }

    public String getNome() {
        return nome;
    }
}
