package br.edu.fatecfranca.ex6;

public class MainEx6 {
    public static void main(String[] args) {
        ContaEspecial conta1 = new ContaEspecial("Ana Júlia Andrade", 1234, 1000.0f,
                8000.0f, 5000.0f);
        ContaEspecial conta2 = new ContaEspecial("Kelly Paula", 5678, 3000.0f,
                6000.0f, 6000.0f);

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
