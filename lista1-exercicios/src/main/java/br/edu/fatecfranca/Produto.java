package br.edu.fatecfranca;

public class Produto {
    public int id;
    public String descricao;
    public int quant;
    public float preco;

    //metodo construtor com parametro
    public Produto(int id, String descricao, int quant, float preco){
        this.id= id;
        this.descricao= descricao;
        this.quant= quant;
        this.preco= preco;
    }
    //metodo construtor vazio
    public Produto (){
        this.id= 0;
        this.descricao= "Não definido.";
        this.quant= 0;
        this.preco= 0;
    }
    public void comprar(int x){
        this.quant= quant + x;
        System.out.println("Compra realizada com sucesso!");
    }
    public void vender(int x){
        this.quant= quant - x;
        System.out.println("Venda realizada com sucesso!");
    }
    public void subir(float x){
        this.preco= preco + x;
        System.out.println("Preço alterado com sucesso:R$" + this.preco);
    }
    public void descer(float x){
        if (this.preco-x>=1) {
            this.preco = preco - x;
            System.out.println("Preço alterado com sucesso:R$" + this.preco);
        } else {
            System.out.println("O preço do produto não pode ser negativo. Altere novamente");
        }
    }
    public void mostrar(){
        System.out.println("ID do produto:"+this.id+" Descrição:"+this.descricao+" Quantidade em estoque:" +
                this.quant+ " Preço:R$"+ this.preco);
    }

}
