package br.edu.fatecfranca;

public class Aluno {
    public int numeroAluno;
    public String nome;
    public int idade;
    public float p1;
    public float p2;
    public float notaFinal;

    //construtores
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade= idade;
        this.p1= p1;
        this.p2= p2;
    }

    //metodo notaFinal
    public void notaFinal(){
        this.notaFinal = (p1+p2)/2;
        System.out.println("A média final do aluno é: " + this.notaFinal);
    }

    //metodo dados do aluno
    public void dadosAluno(){
        System.out.println("Nro aluno:" + this.numeroAluno + " Nome:" + this.nome + " Idade:" + this.idade);
    }

    //metodo passou
    public void aprovado(){
        if (this.notaFinal>=6){
            System.out.println("Aluno aprovado");
        } else{
            System.out.println("Aluno com média inferior a 6. Reprovado");
        }
    }
}