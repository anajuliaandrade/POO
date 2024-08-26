package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.ex1.Cliente;

public class MainCliente {

    public static void main(String[] args) {
        Cliente obj1 = new Cliente();

        IllegalArgumentException e;
        try {
            obj1.setNome("Carlos");
        } catch (IllegalArgumentException var6) {
            e = var6;
            System.out.println(e.getMessage());
        }

        try {
            obj1.setNroAgencia("123435");
        } catch (IllegalArgumentException var5) {
            e = var5;
            System.out.println(e.getMessage());
        }

        try {
            obj1.setNroConta("12345697");
        } catch (IllegalArgumentException var4) {
            e = var4;
            System.out.println(e.getMessage());
        }

        try {
            obj1.setSaldo(0.0F);
        } catch (IllegalArgumentException var3) {
            e = var3;
            System.out.println(e.getMessage());
        }

        obj1.realizarDeposito(1000.0F);
        obj1.realizarSaque(300.0F);
        System.out.println(obj1);
        Cliente obj2 = new Cliente("123456-7", "1234-5", "Carlos", 0.0F);
        obj2.realizarDeposito(1000.0F);
        obj2.realizarSaque(1200.0F);
        System.out.println(obj2);
        if (obj1.equals(obj2)) {
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }

    }
}