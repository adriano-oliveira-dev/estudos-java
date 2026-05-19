package javacore.polimorfismo.test;

import javacore.polimorfismo.repositorio.Repositorio;
import javacore.polimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

        List<String> list =new ArrayList<>();
        list.add("Adriano");
        list.add("Adriana");
        list.add("Bruma");
        System.out.println(list);
    }
}
