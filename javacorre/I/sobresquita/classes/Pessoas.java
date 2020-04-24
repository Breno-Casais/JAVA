package javacorre.I.sobresquita.classes;

public class Pessoas extends Object {
    private String nome;
    private int idaede;
    private int cpf;

    @Override
    public String toString() {
        return "Pessoas{" +
                "nome='" + nome + '\'' +
                ", idaede=" + idaede +
                ", cpf=" + cpf +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdaede() {
        return idaede;
    }

    public void setIdaede(int idaede) {
        this.idaede = idaede;
    }
}
