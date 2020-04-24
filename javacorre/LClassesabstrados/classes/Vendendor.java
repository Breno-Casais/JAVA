package javacorre.LClassesabstrados.classes;

import javacorre.LClassesabstrados.classes.Funcionario;

public class Vendendor extends Funcionario {
    private double totalvendas;

    public Vendendor(double totalvendas) {
        this.totalvendas = totalvendas;
    }

    public Vendendor(String nome, String clt, double salario, double totalvendas) {
        super(nome, clt, salario);
        this.totalvendas = totalvendas;
    }

    public double getTotalvendas() {
        return totalvendas;
    }

    public void setTotalvendas(double totalvendas) {
        this.totalvendas = totalvendas;
    }

    @Override
    public void calcularsalario() {
        this.salario = (salario*1.1);
    }
}
