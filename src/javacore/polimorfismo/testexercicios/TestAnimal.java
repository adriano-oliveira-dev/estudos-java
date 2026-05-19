package javacore.polimorfismo.testexercicios;

import javacore.polimorfismo.exercicios.animais.Animal;
import javacore.polimorfismo.exercicios.animais.Cachorro;
import javacore.polimorfismo.exercicios.animais.Gato;
import javacore.polimorfismo.exercicios.animais.Passaro;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        animais.add(new Animal("Animal generico"));
        animais.add(new Cachorro("CACHORRO"));
        animais.add(new Gato("GATO"));
        animais.add(new Passaro("PASSARO"));

        for(Animal animal: animais){
            System.out.println("Nome: "+animal.getNome());
            animal.emitirSom();
            System.out.println("---------------------------");
        }

    }
}
