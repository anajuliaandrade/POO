package br.edu.fatecfranca.ex2;

public class Natal extends CartaoWeb{
    public Natal(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("\nDestinatário: " + destinatario + "\nFeliz Natal!");
    }
}
