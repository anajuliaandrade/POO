package br.edu.fatecfranca.ex7;

public class MainEx7 {
    public static void main(String[] args) {
        Cartao cartao1 = new Cartao("Ana Júlia", 5000.0f, 1234);
        cartao1.deposito(100.0f, 1234);
        cartao1.retira(150.0f, 1235);
        cartao1.alteraSenha(1234, 4567);
        System.out.println(cartao1);
    }
}
