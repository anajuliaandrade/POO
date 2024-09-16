package br.edu.fatecfranca.ex7;

public class Cartao extends Conta {
    private int senha, novaSenha;

    public Cartao() {
        super();
    }

    public Cartao(String nome, float saldo, int senha) {
        super(nome, saldo);
        this.senha = 1234;
    }

    public void deposito(float x, int senha) {
        if (this.senha == senha) {
            this.saldo = x + saldo;
        } else {
            System.out.println("Senha incorreta. Tente depositar novamente.");
        }
    }

    public boolean retira(float x, int senha) {
        if (this.senha == senha) {
            if (saldo >= x) {
                saldo -= x; // Atualiza o saldo após a retirada
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("Senha incorreta. Tente fazer saque novamente.");
            return false;
        }
    }

    public void alteraSenha(int senha, int novaSenha){
        if (this.senha == senha){
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        }
        else {
            System.out.println("Senha incorreta, tente alterar novamente!");
        }
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "nome='" + nome + '\'' +
                ", saldo=" + saldo +
                ", senha=" + senha +
                '}';
    }
}

