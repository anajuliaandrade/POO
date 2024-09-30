package br.edu.fatecfranca.ex0;

public class AtletaVolei implements IJogadorVolei{

    @Override
    public void sacar() {
        System.out.println("Jogador de voltei sacando ...");
    }

    @Override
    public void levantar() {
        System.out.println("Jogador de voltei levantando ...");
    }
}
