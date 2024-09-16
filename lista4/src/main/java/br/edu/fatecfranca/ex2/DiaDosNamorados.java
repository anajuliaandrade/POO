package br.edu.fatecfranca.ex2;

public class DiaDosNamorados extends CartaoWeb{
    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("\nDestinatário: " + destinatario + "\nFeliz Dia dos Namorados!");
    }
}
