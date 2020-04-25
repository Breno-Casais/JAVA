package JAVA.javacorre.testandogit.teste;

import JAVA.javacorre.testandogit.comeco.Aluno;
import JAVA.javacorre.testandogit.comeco.Funcionaro;

public class teste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("breno","000",98);
        Funcionaro f1 = new Funcionaro("joao","001","matematica",2000);

        a1.calcularrenovacao();
        f1.calcularrenovacao();

    }
}
