package javacore.exceptions.exercicios.dados;

public class Dados {


    public void processarDados(String[] array, int indice, String texto){
        System.out.println(array[0]);
        System.out.println("---------------------");
        System.out.println(array[indice]);
        System.out.println("---------------------");
        int num = Integer.parseInt(texto);
        System.out.println("numero: " + num);
    }

}
