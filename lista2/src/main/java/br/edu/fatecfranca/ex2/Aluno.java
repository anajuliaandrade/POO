package br.edu.fatecfranca.ex2;

public class Aluno {
    private int idade, nroAluno;
    private String nome;
    private float p1, p2;
    private String num = String.valueOf(nroAluno);
    private float media;

    public Aluno() {

    }

    public Aluno(int nroAluno, int idade, String nome, float p1, float p2) {
        this.setNroAluno(nroAluno);
        this.setIdade(idade);
        this.setNome(nome);
        this.setP1(p1);
        this.setP2(p2);
    }

    //gera getters
    public int getNroAluno() {
        return nroAluno;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public float getP1() {
        return p1;
    }

    public float getP2() {
        return p2;
    }

    //gera setters
    public void setNroAluno(int nroAluno) {
        if (num.length()==6){
            this.nroAluno = nroAluno;
        } else {
            throw new IllegalArgumentException("Erro com tamanho do número do aluno.");
        }
    }

    public void setIdade(int idade) {
        if (idade>0){
            this.idade = idade;
        } else {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
    }

    public void setNome(String nome) {
        if (nome.length()<=30) {
            this.nome = nome;
        } else{
            throw new IllegalArgumentException("Nome execede 30 caracteres. Problema com tamanho");
        }
    }

    public void setP1(float p1) {
        if (p1>=0){
            this.p1 = p1;
        } else {
            throw new IllegalArgumentException("Nota P1 não pode ser negativa.");
        }
    }

    public void setP2(float p2) {
        if (p2>=0){
            this.p2 = p2;
        } else {
            throw new IllegalArgumentException("Nota P2 não pode ser negativa.");
        }
    }

    public void notaFinal(){
        this.media= (p1+p2)/2;
        System.out.println("Média final do aluno " + this.nome + ", " + this.media);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nroAluno=" + nroAluno +
                ", idade=" + idade +
                ", nome='" + nome + '\'' +
                '}';
    }
}
