package javacorre.H.Herança.Brincadeira2;

public class Carro extends Veiculos {
    private int valor;

    public Carro(int rodas, String modelo, int ano, boolean blindagem,int valor  ){
        super(rodas, modelo, ano, blindagem);
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println(this.valor);
    }
    public void comparar(Carro carro){
        if(this.getAno() == carro.getAno()){
            System.out.println("deu certo");
        }
    }

    @Override
    public String toString() {
        return "Carro{" +
                "valor=" + valor +
                ", rodas=" + rodas +
                ", modelo='" + modelo + '\'' +
                ", blindagem=" + blindagem +
                '}';
    }
}
