package javacore.Associacao.test;

import javacore.Associacao.dominio.Jogador;
import javacore.Associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldinho Gaucho");
        Time time = new Time("Barcelona");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
