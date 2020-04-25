package JAVA.javacorre.testandogit.comeco;

public abstract class Pessoas {
    protected String nome;
    protected String identidade;

    public Pessoas(String nome, String identidade) {
        this.nome = nome;
        this.identidade = identidade;
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "nome='" + nome + '\'' +
                ", identidade='" + identidade + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }
    public abstract void calcularrenovacao();

}
