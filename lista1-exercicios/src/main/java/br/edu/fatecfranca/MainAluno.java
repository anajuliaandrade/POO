package br.edu.fatecfranca;

public class MainAluno {
    public static void main(String[] args) {
        Aluno testaAluno = new Aluno(1, "Ana", 19, 4.2f, 2.8f);

        testaAluno.notaFinal();
        testaAluno.dadosAluno();
        testaAluno.aprovado();
    }
}
