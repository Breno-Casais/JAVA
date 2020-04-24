package javacorre.K.enumeracao.Juntandotudo;

public class Pessaos {
    protected String nome;
    protected int idade;
    public Sexo sexo;

    public Pessaos(String nome, int idade, Sexo sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessaos{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
