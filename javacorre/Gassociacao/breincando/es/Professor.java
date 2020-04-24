package javacorre.Gassociacao.breincando.es;

import sun.awt.windows.WPrinterJob;

public class Professor {
    private String Nome;
    private String materia;
    private Aluno alunos;
    private Evento evento;

    public Professor(String nome, String materia) {
        Nome = nome;
        this.materia = materia;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Aluno getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno alunos) {
        this.alunos = alunos;
    }

    public void print(){
        System.out.println("relatorio professor");
        System.out.println(this.Nome);
        System.out.println(this.materia);

    }

}
