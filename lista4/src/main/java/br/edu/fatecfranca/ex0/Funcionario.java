package br.edu.fatecfranca.ex0;

public class Funcionario {
    protected String nome, endereco, cpf;
    protected float salario;

    public Funcionario() {
        this.nome= ""; this.endereco=""; this.cpf="";
        this.salario=0;
    }

    public Funcionario(String nome, float salario, String cpf, String endereco) {
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public float getSalario() {
        return salario;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float calculaSalario () {
        return this.salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                '}';
    }
}