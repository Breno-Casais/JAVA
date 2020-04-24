package javacorre.H.Herança.Teste;

import javacorre.H.Herança.Brincadeira2.Endereço;
import javacorre.H.Herança.Brincadeira2.Funcionario;
import javacorre.H.Herança.Brincadeira2.Pessoa;

public class Herançateste {
    public static void main(String[] args) {
        Endereço endereço = new Endereço();
        Pessoa p = new Pessoa("fernando");
        p.setNome("breno");
        p.setCpf("000");
        endereço.setBairro("luordes");
        endereço.setRua("maranhao");
        p.setEndereço(endereço);
        p.print();
        System.out.println("##################");
        Funcionario f = new Funcionario("breno","123");
        f.setNome("algusto");
        f.setCpf("11111");
        f.setSalario(150);
        f.setEndereço(endereço);
        f.imprimi();
        System.out.println("############");
        p.assecar();

    }
}