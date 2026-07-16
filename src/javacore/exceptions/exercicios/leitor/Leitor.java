package javacore.exceptions.exercicios.leitor;

public class Leitor {

    private void lerArquivo(String nome){
        if (nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
    }

    private void processarConfiguracao(String nome){
        try{
            lerArquivo(nome);
        }catch(RuntimeException exception){
            throw new RuntimeException("erro ao processar configuração: ", exception);
        }
    }
    public void iniciarSistema(String nome){
        processarConfiguracao(nome);
    }

}
