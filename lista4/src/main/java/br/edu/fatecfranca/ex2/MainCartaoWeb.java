package br.edu.fatecfranca.ex2;

import java.util.ArrayList;
import java.util.List;

public class MainCartaoWeb {
    public static void main(String[] args) {
        Aniversario dest1 = new Aniversario("Ana Júlia");
        DiaDosNamorados dest2 = new DiaDosNamorados("Guilherme");
        Natal dest3 = new Natal("kelly");

        List<CartaoWeb> cartoes = new ArrayList<CartaoWeb>();
        cartoes.add(dest1);
        cartoes.add(dest2);
        cartoes.add(dest3);

         for (CartaoWeb cartaoWeb: cartoes){
             cartaoWeb.showMessage();// polimorfismo - dependendo de cada posicao do vetor
             //ele vai mostrar um resultado
         }

    }
}
