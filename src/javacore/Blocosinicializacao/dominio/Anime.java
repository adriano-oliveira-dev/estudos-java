package javacore.Blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        System.out.println("dentro do bloco de inicalização");
        episodios =new int[100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i]=i+1;
            
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){
        for (int episodios: this.episodios){
            System.out.print(episodios + " ");

        }
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
