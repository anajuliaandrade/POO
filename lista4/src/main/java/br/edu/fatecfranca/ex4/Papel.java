package br.edu.fatecfranca.ex4;

public class Papel extends Coisa{

    public Papel() {
        super("Papel");
    }

    @Override
    public boolean vence(Coisa outraCoisa) {
        return outraCoisa instanceof Pedra;
    }
}
