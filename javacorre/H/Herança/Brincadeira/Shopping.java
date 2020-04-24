package javacorre.H.Herança.Brincadeira;

public class Shopping extends Loja {

    private int quantidade;
    private Loja loja;

    public Shopping(String nome, String produto, Localiza localiza, int quantidade) {
        super(nome, produto, localiza);
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void print() {
        super.print();
        System.out.println(this.quantidade);
    }
}
