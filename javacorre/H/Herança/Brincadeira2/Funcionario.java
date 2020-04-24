package javacorre.H.Herança.Brincadeira2;

import javacorre.H.Herança.Brincadeira2.Pessoa;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome,String cpf){
        super(nome,cpf); // eu to chamando o contrutor da super;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void ImprimirReciboFuncionario(){
        System.out.println("Eu " + super.nome +" Recebi o pagamento de "+ this.salario);
    }
    public void imprimi(){
        super.print();
        System.out.println("Salario " +this.salario );
        ImprimirReciboFuncionario();
    }
}
