package br.edu.fatecfranca.ex0;
import java.util.ArrayList;
import java.util.List;
//é o objeto-todo para a associação com o CarItem
public class ShoppingCart {
    private int id;
    private double price;
    private String endereco;
    private String formaPgto;
    private List<CarItem> carItens;

    public ShoppingCart (){
        this.formaPgto= "";
        this.endereco="";
        //aloca espaco na memoria para o vetor carItens
        carItens= new ArrayList<CarItem>();
    }

    public ShoppingCart(int id, String endereco, String formaPgto) {
        this.id = id;
        this.price = 0;
        this.endereco = endereco;
        this.formaPgto = formaPgto;
        //aloca espaco na memoria para o vetor carItens
        carItens= new ArrayList<CarItem>();
    }

    //getters
    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getFormaPgto() {
        return formaPgto;
    }

    public List<CarItem> getCarItens() {
        return carItens;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setFormaPgto(String formaPgto) {
        this.formaPgto = formaPgto;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", price=" + price +
                ", endereco='" + endereco + '\'' +
                ", formaPgto='" + formaPgto + '\'' +
                ", carItens=" + carItens +
                '}';
    }

    //metodo para adicionar um item de carrinho ao carrinho de compra
    //este metodo envolve conceito de composição, ou seja, item de carrinho
    //precisa ser criado dentro do metodo
    public void addCarItem(int id, int quant, Product product){
        carItens.add(new CarItem(id, quant, product));
    }

    //calcula o valor total do carrinho
    public void calculatePrice (){
        double total = 0;
        //para cada item do carrinho carItrm
        for (CarItem item: carItens){
            total += item.getQuant() * item.getProduct().getPrice();
        }
        this.price = total;
    }
}
