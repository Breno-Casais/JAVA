package JAVA.javacorre.LClassesabstrados.teste;

import JAVA.javacorre.LClassesabstrados.classes.Gerente;
import JAVA.javacorre.LClassesabstrados.classes.Vendendor;

public class teste {
    private static Object Gerente;

    public static void main(String[] args) {
        Gerente g1 = new Gerente("Ana","02122-12",2000);
        Vendendor v1 = new Vendendor("Breno","02122-12",2000,2000);

        g1.calcularsalario();
        v1.calcularsalario();

        System.out.println(v1);
        System.out.println(g1);

        System.out.println("#################");

        g1.imprimi();
    }
}


