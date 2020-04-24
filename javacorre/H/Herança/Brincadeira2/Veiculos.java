package javacorre.H.Herança.Brincadeira2;

import javacorre.H.Herança.Teste.Brincadeira2;

public class Veiculos extends Object {
    protected int rodas;
    protected String modelo;
    private int  ano;
    protected boolean blindagem = false;

    public Veiculos(int rodas, String modelo, int ano, boolean blindagem) {
        this.rodas = rodas;
        this.modelo = modelo;
        this.ano = ano;
        this.blindagem = blindagem;
    }

   public Veiculos(){
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isBlindagem() {
        return blindagem;
    }

    public void setBlindagem(boolean blindagem) {
        this.blindagem = blindagem;
    }
    public void imprimir(){
        System.out.println("fazendo a impresão");
        System.out.print("o modelo é : ");
        System.out.println(this.modelo);
        System.out.print("o ano é : ");
        System.out.println(this.ano);
        System.out.print("a quantidade de rodas é : ");
        System.out.println(this.rodas);
        System.out.print("a blindagem é : ");
        System.out.println(this.blindagem);

    }

    @Override
    public String toString() {
        return "Veiculos{" +
                "rodas=" + rodas +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", blindagem=" + blindagem +
                '}';
    }
}
