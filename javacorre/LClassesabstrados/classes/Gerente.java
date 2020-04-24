package javacorre.LClassesabstrados.classes;

import javacorre.LClassesabstrados.classes.Funcionario;

public class Gerente extends Funcionario {
    public Gerente() {
    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public void calcularsalario() {
        this.salario = (salario*1.2);
    }
}
