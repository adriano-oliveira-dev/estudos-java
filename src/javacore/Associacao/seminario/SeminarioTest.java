package javacore.Associacao.seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        Local local =new Local("Parque Ibirapuera");
        Aluno aluno = new Aluno("Adriano",21);
        Professor professor = new Professor("Guanabara","Java");
        Aluno[] alunos ={aluno};

        Seminario seminario =new Seminario("Aprendendo java",alunos,local);

        Seminario[] seminarios ={seminario};

        professor.setSeminarios(seminarios);

        professor.imprime();
    }
}
