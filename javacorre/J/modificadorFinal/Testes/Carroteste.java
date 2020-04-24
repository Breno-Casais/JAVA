package javacorre.J.modificadorFinal.Testes;

import javacorre.J.modificadorFinal.classes.Carro;

public class Carroteste {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(Carro.VELOCIDADE_FINAL);
        System.out.println(c.getComprador());
        c.getComprador().setNoome("vem");
        System.out.println(c.getComprador());

    }
}
