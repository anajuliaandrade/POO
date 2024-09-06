package br.edu.fatecfranca.ex0;

public class CarItem {
    //é o objeto-todo para a associação com o Product
    // é o objeto-parte para a associação com o ShoppingCart
    private int id, quant;
    //objeto parte
    private Product product;

    public CarItem() {
    }

    public CarItem(int id, int quant, Product product) {
        this.id = id;
        this.quant = quant;
        this.product = product;
    }

    //getters
    public int getId() {
        return id;
    }

    public int getQuant() {
        return quant;
    }

    public Product getProduct() {
        return product;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "\nCarItem{" +
                "id=" + id +
                ", quant=" + quant +
                ", product=" + product + //ele esta chamando o to string desse obj
                '}';
    }
}
