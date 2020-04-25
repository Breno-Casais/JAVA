package JAVA.javacorre.testandogit.comeco;

public class Aluno extends Pessoas{
    protected double notaFinal;

    public Aluno(String nome, String identidade, double notaFinal) {
        super(nome, identidade);
        this.notaFinal = notaFinal;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }


    public String toString1() {
        return "Aluno{" +
                "notaFinal=" + notaFinal +
                ", nome='" + nome + '\'' +
                ", identidade='" + identidade + '\'' +
                '}';
    }

    @Override
    public void calcularrenovacao() {
        System.out.println("nao renovado");
    }
}
