package javacorre.F.MetodoEstatico.testte;

import javacorre.F.MetodoEstatico.Clas.Carro;

public class Carrotest {
    public static void main(String[] args) {
        Carro.setvelLimite(300);
        Carro c1 = new Carro("bmw",280);
        Carro c2 = new Carro("audi",275);
        Carro c3 = new Carro("mercedes",290);

        c1.mostrar();
        c2.mostrar();
        c3.mostrar();

        System.out.println("###############");



        c1.mostrar();
        c2.mostrar();
        c3.mostrar();
    }
}
