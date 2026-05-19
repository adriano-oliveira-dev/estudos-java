package javacore.polimorfismo.servico;

import javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioArtquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no arquivo");
    }
}
