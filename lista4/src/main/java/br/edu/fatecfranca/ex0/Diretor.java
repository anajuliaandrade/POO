package br.edu.fatecfranca.ex0;

public class Diretor extends Funcionario{
    private float acoes;

    public Diretor() {
        super();
        this.acoes=0;
    }

    public Diretor(String nome, float salario, String cpf, String endereco, float acoes) {
        super(nome, salario, cpf, endereco);
        this.acoes = acoes;
    }

    public float getAcoes() {
        return acoes;
    }

    public float setAcoes(float acoes) {
        return this.acoes = acoes;
    }

    @Override
    public float calculaSalario(){
        return this.salario= this.salario+((this.acoes *5)/12);
    }

    @Override
    public String toString() {
        return super.toString() + "\nAções= "+ acoes;
    }
}
