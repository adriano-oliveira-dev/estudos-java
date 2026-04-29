package javacore.Associacao.test;

import javacore.Associacao.dominio.Jogador;
import javacore.Associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Ronaldo");
        Jogador jogador2 = new Jogador("Kaká");
        Time time =new Time("Brasil");

        Jogador[] jogadores ={jogador,jogador2};
        time.setJogadores(jogadores);

        jogador.setTime(time);
        jogador2.setTime(time);


        time.imprime();
        System.out.println("------------------");
        for (Jogador jogadore: jogadores) {
            jogadore.imprime();
            System.out.println("-----------------");

        }

    }
}
