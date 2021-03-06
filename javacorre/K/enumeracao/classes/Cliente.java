package javacorre.K.enumeracao.classes;

public class Cliente {
    private String nome;
    public static final int PESSOA_FISICA = 1;
    public static final int PESSOA_JURIDICA = 2;
    private int tipo;

    public Cliente(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
