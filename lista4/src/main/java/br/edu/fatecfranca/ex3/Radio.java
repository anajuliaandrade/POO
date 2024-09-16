package br.edu.fatecfranca.ex3;

public class Radio extends Produto{
    private String estacao;
    private float banda;

    public Radio() {
        super();
    }

    public Radio(int serial, int volume, float banda, String estacao) {
        super(serial, volume);
        this.banda = banda;
        this.estacao = estacao;
    }

    public float getBanda() {
        return banda;
    }

    public void setBanda(float banda) {
        this.banda = banda;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }

    @Override
    public String toString() {
        return  super.toString() + "\n" +
                "Radio{" +
                "banda='" + banda + '\'' +
                ", estacao=" + estacao +
                '}';
    }
}
