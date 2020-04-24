package javacorre.Gassociacao.breincando.teste;

import javacorre.Gassociacao.breincando.es.Aluno;
import javacorre.Gassociacao.breincando.es.Endereco;
import javacorre.Gassociacao.breincando.es.Evento;
import javacorre.Gassociacao.breincando.es.Professor;

public class testeeee {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("breno");
        Aluno aluno1 = new Aluno("fernando");
        Endereco endereco = new Endereco("francisco","vila sao francisco");
        Professor prof = new Professor("joao","matematicaaaa");
        Professor prof1 = new Professor("pereira","fisica");
        Evento envento = new Evento("matematica",prof);

        aluno.setEvento(envento);
        aluno.setProfessor(prof);
        aluno.setEndereco(endereco);

        //prof.setEvento(envento);
        envento.print();
        //aluno.print();
        System.out.println("#####################3");
        envento.setProfessor(prof1);
        envento.print();
        System.out.println("######################");
        aluno.setProfessor(prof1);
        aluno.print();
    }
}
