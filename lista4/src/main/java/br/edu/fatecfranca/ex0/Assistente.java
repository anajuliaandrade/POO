package br.edu.fatecfranca.ex0;

public class Assistente extends Funcionario{
    private float horaExtra;

    public Assistente() {
        super(); //chama o construtor sem parametro
        this.horaExtra=0;
    }

    public Assistente(String nome, float salario, String cpf, String endereco, float horaExtra) {
        super(nome, salario, cpf, endereco);
        this.horaExtra = horaExtra;
    }

    //getter
    public float getHoraExtra() {
        return horaExtra;
    }
    //setter
    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    public float calculaSalario (){
        return this.salario = this.salario + this.horaExtra * 40.0f;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHora Extra: " + horaExtra;
    }
}
