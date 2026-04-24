package javacore.Sobrecargametodos.teste;

import javacore.Sobrecargametodos.dominio.Anime;

public class TestAnime {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("One Piece","TV",1000,"Shonen");

        anime.imprime();
    }
}
