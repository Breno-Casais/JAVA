package javacorre.H.Herança.Teste;

import javacorre.H.Herança.Brincadeira.Localiza;
import javacorre.H.Herança.Brincadeira.Loja;
import javacorre.H.Herança.Brincadeira.Shopping;

public class brincadeiratesteeee {
    public static void main(String[] args) {
        Localiza localiza = new Localiza("vila","sao francisco");
        Loja loja = new Loja("xique","roupa",localiza);
        Shopping shopping = new Shopping("gv","camisas",localiza,3);

        loja.print();

        System.out.println("#######################");

        shopping.print();

    }
}
