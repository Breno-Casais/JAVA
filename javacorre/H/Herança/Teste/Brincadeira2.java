package javacorre.H.Herança.Teste;

import javacorre.H.Herança.Brincadeira2.Carro;
import javacorre.H.Herança.Brincadeira2.Moto;
import javacorre.H.Herança.Brincadeira2.Veiculos;

public class Brincadeira2 {
    public static void main(String[] args) {
        //Veiculos v1 = new Veiculos(2,"fiate",2020,false);
        Carro c1 = new Carro(4,"mercedes",2018,true,180000);
        Carro c2 = new Carro(4,"mercedess",2018,true,1800000);
        Moto m1 = new Moto();
        c1.imprimir();
        System.out.println("-----------------------");
        System.out.println(c1.toString());
        //v1.imprimir();
        System.out.println("-----------------");
        //m1.imprimir();
        c1.comparar(c2);

    }
}
