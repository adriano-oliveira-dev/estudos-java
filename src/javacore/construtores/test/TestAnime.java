package javacore.construtores.test;


import javacore.construtores.dominio.Anime;

public class TestAnime {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece","TV",1000,"Shonen","Toei Animation");
        anime.imprime();
        System.out.println("-----------------------------------");

    }
}
