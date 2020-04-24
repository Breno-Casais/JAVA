package javacorre.K.enumeracao.Juntandotudo;

public class Aluno extends Pessaos {
    protected String matricula;
    protected float nota;


    public Aluno(String nome, int idade, Sexo sexo,String matricula,float nota){
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nota=" + nota +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                '}';
    }
}
