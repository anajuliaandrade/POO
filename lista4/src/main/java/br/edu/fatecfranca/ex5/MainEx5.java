package br.edu.fatecfranca.ex5;

public class MainEx5 {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Ana Júlia Andrade", 1234, 4000.0f,
                8000.0f, 5000.0f);
        Conta conta2 = new Conta("Kelly Paula", 5678, 3500.0f,
                7500.0f, 2000.0f);

        conta1.deposito(2000.0f);
        boolean retirada1 = conta1.retira(12000.0f); // Tentativa de retirar
        System.out.println("Retirada da conta 1: " + retirada1);
        System.out.println(conta1);
        conta2.deposito(500.0f);
        boolean retirada2 = conta1.retira(1000.0f);
        System.out.println("Retirada da conta 2: " + retirada2);
        System.out.println(conta2);

    }
}
