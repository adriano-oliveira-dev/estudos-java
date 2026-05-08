package javacore.Heranca.dominio;

public class Aluno extends Pessoa02{

    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
    public void exibirInfo() {
        System.out.println("****** ALUNO ******");
        super.exibirInfo();
        System.out.println("Matricula: "+matricula);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
