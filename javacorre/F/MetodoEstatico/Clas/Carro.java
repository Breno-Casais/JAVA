package javacorre.F.MetodoEstatico.Clas;

public class Carro {
    //todos os carros devem ter uma vvelocidade limite de 240 km;
    // quando eu coloco o metodo static, eu to colocando aquele atributo para toda classe
    private String nome;
    private double VelMax;
    private static double velLimite = 240;

    public static void setvelLimite (double velLimete){
        Carro.velLimite = velLimete;
    }
    public static double getvelLimite (){
        return velLimite;

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setVelMax(double Velmax){
        this.VelMax = Velmax;
    }

    public double getVelMax(){
        return VelMax;
    }

    public double getVelLimite() {
        return velLimite;
    }

    public void setVelLimite(double velLimite) {
        this.velLimite = velLimite;
    }

    public Carro(String nome, double velMax) {
        this.nome = nome;
        VelMax = velMax;
    }
    public  Carro(){

    }

    public void mostrar(){
        System.out.println(this.getNome());
        System.out.println(this.getVelMax());
        System.out.println(this.getVelLimite());
        System.out.println("---------------------");
    }


}
