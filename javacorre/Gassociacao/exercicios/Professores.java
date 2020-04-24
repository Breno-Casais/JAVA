package javacorre.Gassociacao.exercicios;

public class Professores {
    private Seminario seminario;
    private String nome;
    private String especialidade;

    public Professores(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professores() {
    }
    public void print(){
        System.out.println(this.nome);
        System.out.println(this.especialidade);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
