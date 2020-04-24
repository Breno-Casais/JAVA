package Treinando.asdasd;

public class primeiroprojeto {
    private String nome;
    private int idade;
    private int cpf;
    public static int tamanho = 0;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public primeiroprojeto(){

    }
    public primeiroprojeto(int idade, int cpf , String nome){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;

    }

    public void mostrar(){
        System.out.println("o que voce deseja fazer");
        System.out.println("1- cadastrar");
        System.out.println("2- excluir");
        System.out.println("3- alterar");
        System.out.println("a quantidade de pessoas cadastradas sao de " + tamanho);

    }
    public void cadastrar(int idade, int cpf, String nome){
        System.out.println("qual e o seu nome");
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        tamanho = tamanho+ 1 ;
    }
    public void listar(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.cpf);
        System.out.println(tamanho);
    }

}
