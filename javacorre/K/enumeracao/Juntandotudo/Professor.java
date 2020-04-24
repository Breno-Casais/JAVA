package javacorre.K.enumeracao.Juntandotudo;

public class Professor extends Pessaos {
    protected String materia;
    protected float salario;

    public Professor(String materia, float salario, String nome,int idade,Sexo sexo) {
        super(nome, idade, sexo);
        this.materia = materia;
        this.salario = salario;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void relatorio(){
        System.out.println(super.getNome());
        System.out.println(super.getIdade());
        System.out.println(super.getSexo());
        System.out.println(this.getMateria());
        System.out.println(this.getSalario());
    }
}
