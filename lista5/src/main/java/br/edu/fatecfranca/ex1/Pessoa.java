package br.edu.fatecfranca.ex1;

public class Pessoa extends Animal implements Cidadao, Contribuinte, Empregado, Professor{
    //extends animal é a herança do codigo fonte
    //implements é a herança de comportamento
    @Override
    public void vota() {
        System.out.println("vota");
    }

    @Override
    public void getRg() {
        System.out.println("RG");
    }

    @Override
    public void pagaIr() {
        System.out.println("paga IR");
    }

    @Override
    public void getCPF() {
        System.out.println("CPF");
    }

    @Override
    public void trabalha() {
        System.out.println("trabalha");
    }

    @Override
    public void ensina() {
        System.out.println("ensina");
    }
}
