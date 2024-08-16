package br.edu.fatecfranca;

public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio (String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel= nivel;
        this.poluido= poluido;
    }
    public Rio(){
        this.nome= "Não definido.";
        this.nivel= 0;
        this.poluido= false;
    }
    public void chover (float x){
        this.nivel= nivel + x;
        System.out.println("Choveu e o nível do rio aumento para: " + this.nivel);
    }
    public void ensolarar(float x){
        this.nivel= nivel-x;
        System.out.println("O dia foi ensolarado e o nível do rio diminuiu para: " + this.nivel);
    }
    public void limpar(){
        if (!this.poluido){
            System.out.println("O rio esta sem poluição e nao precisa ser limpo.");
        } else {
            System.out.println("O rio estava poluido, foi limpo e está sem poluição.");
            this.poluido = false;
        }
    }
    public void sujar(){
        if (!this.poluido){
            System.out.println("O rio ja estava poluído.");
        } else {
            System.out.println("O rio estava limpo e foi poluído. ");
            this.poluido = true;
        }
    }
    public void mostrar(){
        System.out.println("Nome do rio:"+this.nome+" Nível do rio:"+this.nivel+" Poluição do rio: " + this.poluido);
    }
}
