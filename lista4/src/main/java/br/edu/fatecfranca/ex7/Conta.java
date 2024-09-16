package br.edu.fatecfranca.ex7;

public class Conta {
        protected String nome;
        protected float saldo;

        public Conta() {
        }

        public Conta(String nome, float saldo) {
            this.nome = nome;
            this.saldo = saldo;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public float getSaldo() {
            return saldo;
        }

        public void setSaldo(float saldo) {
            this.saldo = saldo;
        }

        @Override
        public String toString() {
            return "Conta{ nome='" + nome +
                    '}';
        }
    }



