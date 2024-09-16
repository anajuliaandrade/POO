package br.edu.fatecfranca.ex4;

public class Pedra extends Coisa {

    public Pedra() {
        super("Pedra");
    }

    @Override
    public boolean vence(Coisa outraCoisa) {
        return outraCoisa instanceof Tesoura;
    }
}
