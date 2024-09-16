package br.edu.fatecfranca.ex2;

public class Aniversario extends CartaoWeb {

    public Aniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("\nDestinatário: " + destinatario + "\nFeliz aniversário!");
    }
}
