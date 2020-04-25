package JAVA.javacorre.LClassesabstrados.classes;

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

    @Override
    public void calcularFuturoProjeto() {
        this.salario = this.salario*1.5;
    }

    @Override
    public void imprimi() {
        super.toString();
    }
}
