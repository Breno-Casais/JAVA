package javacorre.Gassociacao.breincando.es;

public class Aluno {
    private String nome;
    private Professor professor;
    private Evento evento;
    private Endereco endereco;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void print (){
        System.out.println("relatorio aluno");
        System.out.println(this.nome);
        System.out.println(this.evento.getAula());
        System.out.println("professor" + this.professor.getNome() + this.professor.getMateria());
        System.out.println("endereco : " + this.endereco.getBairro() + " " + this.endereco.getRua());
    }
}
