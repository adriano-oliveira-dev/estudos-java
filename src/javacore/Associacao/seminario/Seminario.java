package javacore.Associacao.seminario;

public class Seminario {
    private String titulo;
    private Aluno[] aluno;
    private Local local;

    public Seminario(String titulo, Aluno[] aluno,Local local) {
        this.titulo = titulo;
        this.aluno = aluno;
        this.local = local;
    }

    public void lotacao(){
        if(aluno.length==40){
            System.out.println("Este seminario já está lotado");
            return;
        }

    }


    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
