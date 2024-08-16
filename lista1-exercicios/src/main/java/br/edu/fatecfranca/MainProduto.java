package br.edu.fatecfranca;

public class MainProduto {
    public static void main(String[] args){
        Produto produto1 = new Produto(1, "carne", 5, 45.5f);
        Produto produto2 = new Produto();
        //teste com parametros passados
        produto1.comprar(2);
        produto1.vender(1);
        produto1.subir(5.5f);
        produto1.descer(1);
        produto1.mostrar();

        //teste sem parametros
        produto2.comprar(2);
        produto2.vender(1);
        produto2.subir(5.5f);
        produto2.descer(6);
        produto2.mostrar();

    }
}