package javacorre.H.Herança.Brincadeira;

public class Loja {
    private String nome;
    private String produto;
    private Localiza localiza;

    public Loja(String nome, String produto, Localiza localiza) {
        this.nome = nome;
        this.produto = produto;
        this.localiza = localiza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Localiza getLocaliza() {
        return localiza;
    }

    public void setLocaliza(Localiza localiza) {
        this.localiza = localiza;
    }

    public void print(){
        System.out.println(this.nome);
        System.out.println(this.produto);
        System.out.println(this.localiza.getBairro());
        System.out.println(this.localiza.getRua());
    }

}
