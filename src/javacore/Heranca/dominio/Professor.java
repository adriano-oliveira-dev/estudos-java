package javacore.Heranca.dominio;

public class Professor extends Pessoa02{
    private String especialidade;

    public Professor(String nome, int idade, String especialidade) {
        super(nome, idade);
        this.especialidade = especialidade;
    }
    public void exibirInfo(){
        System.out.println("****** PROFESSOR ******");
        super.exibirInfo();
        System.out.println("Especialidade: "+especialidade);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
