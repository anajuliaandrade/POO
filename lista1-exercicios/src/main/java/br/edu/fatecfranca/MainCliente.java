package br.edu.fatecfranca;

public class MainCliente {
    public static void main(String[] args){
        Cliente fulano = new Cliente(1, 1, "Fulano", 100);
        Cliente beltrano = new Cliente(2, 2, "Beltrano", 50);

        fulano.deposito(1000);
        fulano.saque(100);
        System.out.println(fulano.mostrar());
        beltrano.deposito(50);
        beltrano.saque(150);
        System.out.println(beltrano.mostrar());
    }
}
