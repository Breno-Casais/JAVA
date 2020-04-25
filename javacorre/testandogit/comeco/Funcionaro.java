package JAVA.javacorre.testandogit.comeco;

public class Funcionaro extends Pessoas {
    protected String materia;
    protected double msalario;

    public Funcionaro(String nome, String identidade, String materia, double msalario) {
        super(nome, identidade);
        this.materia = materia;
        this.msalario = msalario;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getMsalario() {
        return msalario;
    }

    public void setMsalario(double msalario) {
        this.msalario = msalario;
    }

    @Override
    public String toString() {
        return "Funcionaro{" +
                "materia='" + materia + '\'' +
                ", msalario=" + msalario +
                ", nome='" + nome + '\'' +
                ", identidade='" + identidade + '\'' +
                '}';
    }

    @Override
    public void calcularrenovacao() {
        System.out.println("renovado");
    }
}
