package br.edu.fatecfranca.ex3;

public class MainControle {
    public static void main(String [] args){
        Produto prod;
        prod = new Radio(111, 222, 96.5f, "FM");
        prod.testaUnidade();
        System.out.println(prod);//chama o toString() da classe Radio

        prod = new Tv(888, 999, 539);
        prod.testaUnidade();
        System.out.println(prod);// chama o toString() da classe Tv

    }

}
