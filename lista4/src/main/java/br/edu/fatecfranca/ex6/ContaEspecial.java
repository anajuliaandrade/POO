package br.edu.fatecfranca.ex6;

public class ContaEspecial {
    protected String nome;
    protected float salario, saldo, limite;
    protected int nroConta;

    public ContaEspecial() {
    }

    public ContaEspecial(String nome, int nroConta, float salario, float saldo, float limite) {
        this.nome = nome;
        this.nroConta = nroConta;
        this.salario = salario;
        this.saldo = saldo;
        setLimite(limite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNroConta() {
        return nroConta;
    }

    public void setNroConta(int nroConta) {
        this.nroConta = nroConta;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        if (limite > salario*3) {
            System.out.println("Limite não pode ser maior que que 3x o valor do salário!");
        } else {
            this.limite = limite;
        }
    }


    public void deposito (float x){
        this.saldo= x + saldo;
    }

    public boolean retira (float x) {
        if (saldo >= x) {
            saldo -= x; // Atualiza o saldo após a retirada
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "limite=" + limite +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                ", saldo=" + saldo +
                ", nroConta=" + nroConta +
                '}';
    }
}

