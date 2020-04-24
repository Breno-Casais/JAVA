package javacorre.Gassociacao.breincando.es;

public class Endereco {
    private String bairro;
    private String rua;
    private Evento evento;

    public Endereco(String bairro, String rua) {
        this.bairro = bairro;
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public void print (){
        System.out.println("-----------relatorio endereco;-----------");
        System.out.println("bairro" + this.bairro);
        System.out.println("bairro" + this.rua);
    }
}
