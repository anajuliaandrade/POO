package br.edu.fatecfranca.ex4;

public abstract class Coisa {
    protected String nome;

    public Coisa() {
       this.nome="";
    }

    public Coisa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract boolean vence(Coisa outraCoisa);// Método abstrato para definir a vitória

    @Override
    public String toString() {
        return "Coisa{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
