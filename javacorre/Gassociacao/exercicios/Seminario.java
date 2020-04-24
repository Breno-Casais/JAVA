package javacorre.Gassociacao.exercicios;

public class Seminario {
    private Alunos[] anlunos;
    private Professores professores;
    private Local local;
    private String nome;

    public Seminario( String nome) {
        this.nome = nome;
    }

    public Seminario() {

    }

    public void print(){
        System.out.println("titulo: "+ this.nome);
        System.out.println(this.professores.getNome());
        System.out.println(this.professores.getEspecialidade());

    }
    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Alunos[] getAnlunos() {
        return anlunos;
    }

    public void setAnlunos(Alunos[] anlunos) {
        this.anlunos = anlunos;
    }

    public Professores getProfessores() {
        return professores;
    }

    public void setProfessores(Professores professores) {
        this.professores = professores;
    }


}
