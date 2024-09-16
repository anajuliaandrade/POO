package br.edu.fatecfranca.ex0;

public class Gerente extends Funcionario{
    private float bonus;

    public Gerente () {
        super();
        this.bonus=0;
    }

    public Gerente(String nome, float salario, String cpf, String endereco, float bonus) {
        super(nome, salario, cpf, endereco);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
    @Override
    public float calculaSalario(){
        return this.salario = this.salario + this.bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBonus = " + bonus;
    }
}
