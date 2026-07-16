package javacore.exceptions.exercicios.cadastroDeClientes;

public class Main {
    public static void main(String[] args) {
        try {
            Usuario user1 = new Usuario("Adriano",-5);
        }catch (IdadeInvalidaException exception){
            System.out.println("Erro: " +exception.getMessage());
        }
        System.out.println("----------------------------------");
          try {
            Usuario user1 = new Usuario("Adriana",30);
        }catch (IdadeInvalidaException exception){
              System.out.println("Erro: " +exception.getMessage());
        }
        System.out.println("----------------------------------");
          try {
            Usuario user1 = new Usuario("Juliana",200);
        }catch (IdadeInvalidaException exception){
              System.out.println("Erro: " +exception.getMessage());
        }


    }

}
