package JAVA.javacorre.LClassesabstrados.classes;

public abstract class Pessoa {
    protected String nome;
    protected String identidade;

    public abstract void imprimi();

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
}
