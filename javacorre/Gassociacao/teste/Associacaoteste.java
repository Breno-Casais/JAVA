package javacorre.Gassociacao.teste;

import javacorre.Gassociacao.exercicios.Alunos;
import javacorre.Gassociacao.exercicios.Local;
import javacorre.Gassociacao.exercicios.Professores;
import javacorre.Gassociacao.exercicios.Seminario;

public class Associacaoteste {
    public static void main(String[] args) {
        Alunos aluno = new Alunos("breno",20);
        Alunos aluno2 = new Alunos("joana",20);

        Seminario seminario = new Seminario("como ser um baita programador");
        Professores prof = new Professores("fernando","medico");
        Local local = new Local("rua vicente ", "luordes");

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        seminario.setProfessores(prof);
        seminario.setLocal(local);
        seminario.setAnlunos(new Alunos[]{aluno,aluno2});

        System.out.println("#########");
        seminario.print();

    }
}
