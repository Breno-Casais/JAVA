package javacorre.Gassociacao.exercicios;

public class Alunos {
    private String aluno;
    private int idade;
    private Seminario seminario;

    public Alunos() {
    }

    public Alunos(String aluno, int idade) {
        this.aluno = aluno;
        this.idade = idade;
    }

    public void print(){
        System.out.println("nome: " + this.aluno);
        System.out.println("idade: " + this.idade);
        System.out.println("seminario: " + this.seminario.getNome() );
    }
    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

}
