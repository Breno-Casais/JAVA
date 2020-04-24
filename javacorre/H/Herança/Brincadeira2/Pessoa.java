package javacorre.H.Herança.Brincadeira2;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereço endereço;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome,String cpf){
        this(nome); //eu passo como parametro o nome para que ele seja inicialido no contrutor de cima
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }

    public void print(){
        System.out.println("nome:  " + this.getNome());
        System.out.println("Cpf:  " + this.getCpf());
        System.out.println("Bairro:  " + this.endereço.getBairro());
        System.out.println("Rua:  " + this.endereço.getRua());
    }
    public void assecar(){
        System.out.println(endereço.bairro);
    }


}
