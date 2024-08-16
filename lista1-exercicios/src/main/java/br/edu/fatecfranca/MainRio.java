package br.edu.fatecfranca;

public class MainRio {
    public static void main(String[] args){
        Rio rio1 = new Rio("sena", 10.5f, true );
        Rio rio2 = new Rio();

        rio1.chover(12.1f);
        rio1.ensolarar(2.1f);
        rio1.limpar();
        rio1.mostrar();

        rio2.chover(11.1f);
        rio2.ensolarar(2.1f);
        rio2.sujar();
        rio2.mostrar();
    }
}
