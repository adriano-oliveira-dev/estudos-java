package javacore.exceptions.exercicios.leitor;

public class Main {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();

        try{
            leitor.iniciarSistema(null);
        }catch (RuntimeException e){
            System.out.println("Mensagem: " + e.getMessage());
            System.out.println("Causa: " + e.getCause().getMessage());
        }
    }
}
