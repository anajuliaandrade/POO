package br.edu.fatecfranca.ex4;

public class Tesoura extends Coisa{
    public Tesoura() {
        super("Tesoura");
    }

    @Override
    public boolean vence(Coisa outraCoisa) {
        return outraCoisa instanceof Papel;
    }
}
