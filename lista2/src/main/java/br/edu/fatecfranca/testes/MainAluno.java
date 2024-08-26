package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.ex2.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        IllegalArgumentException e;
        try {
            aluno1.setNroAluno(1);
        } catch (IllegalArgumentException var1){
            e = var1;
            System.out.println(e.getMessage());
        }

        try {
            aluno1.setIdade(19);
        } catch (IllegalArgumentException var2){
            e = var2;
            System.out.println(e.getMessage());
        }

        try {
            aluno1.setNome("Ana Júlia Andrade");
        } catch (IllegalArgumentException var3){
            e = var3;
            System.out.println(e.getMessage());
        }

        try {
            aluno1.setP1(9);
        } catch (IllegalArgumentException var4){
            e = var4;
            System.out.println(e.getMessage());
        }

        try {
            aluno1.setP2(5);
        } catch (IllegalArgumentException var5){
            e = var5;
            System.out.println(e.getMessage());
        }

        aluno1.notaFinal();
        System.out.println(aluno1);

    }
}
