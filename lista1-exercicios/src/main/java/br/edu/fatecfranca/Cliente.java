package br.edu.fatecfranca;

public class Cliente {
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;

    public Cliente (int numeroConta, int numeroAgencia, String nome, float saldo){
        this.numeroConta= numeroConta;
        this. numeroAgencia= numeroAgencia;
        this.nome= nome;
        this.saldo= saldo;
    }

    public void deposito(float x){
        this.saldo = saldo + x;
        System.out.println("Deposito realizado com sucesso!");
    }

    public void saque(float x){
        if (this.saldo - x >= 0) {
            this.saldo = saldo - x;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente! Falha ao realizar o saque!");
        }
    }
    public String mostrar(){
        return "Nro da conta:"+ this.numeroConta + " Nome do cliente:" + this.nome+
                " Saldo Atual: R$" + this.saldo;
    }

}
