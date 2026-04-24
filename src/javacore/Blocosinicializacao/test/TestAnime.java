package javacore.Blocosinicializacao.test;

import javacore.Blocosinicializacao.dominio.Anime;

public class TestAnime {
    public static void main(String[] args) {
        Anime anime =new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio +" ");
        }

    }
}
