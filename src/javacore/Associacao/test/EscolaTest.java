package javacore.Associacao.test;

import javacore.Associacao.dominio.Escola;
import javacore.Associacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Adriano");
        Professor[] professores ={professor1};
        Escola escola = new Escola("IFRN",professores);

        escola.imprime();
    }
}
