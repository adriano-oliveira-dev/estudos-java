package javacore.Associacao.test;

import javacore.Associacao.dominio.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldo");
        Jogador jogador2 = new Jogador("Adriano");
        Jogador jogador3 = new Jogador("Kaká");
        Jogador[] jogadores ={jogador1,jogador2,jogador3};

        for (Jogador jogador: jogadores){
            jogador.imprime();
        }

    }
}
