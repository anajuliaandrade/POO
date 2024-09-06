package br.edu.fatecfranca.testes;
import br.edu.fatecfranca.ex0.Product;
import br.edu.fatecfranca.ex0.ShoppingCart;

public class MainCarItem {
    public static void main(String[] args) {
        Product prod1 = new Product(1, "Monitor", 600);
        Product prod2 = new Product(2, "Teclado", 140);
        Product prod3 = new Product(3, "Mouse", 90);

        ShoppingCart shop1 = new ShoppingCart(1, "Franca", "Cartão de crédito");
        shop1.addCarItem(1,5,prod1);
        shop1.addCarItem(3,10, prod2);
        shop1.calculatePrice();
        System.out.println(shop1.toString());
    }
}