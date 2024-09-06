package br.edu.fatecfranca.ex3;

public class Reservation {
    private int id;
    private String data;
    private Passenger passageiro;

    public Reservation() {
        this.data="";
    }

    public Reservation( int id, Passenger passageiro, String data) {
        this.data = data;
        this.id = id;
        this.passageiro = passageiro;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Passenger getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passenger passageiro) {
        this.passageiro = passageiro;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "data='" + data + '\'' +
                ", id=" + id +
                ", passageiro=" + passageiro +
                '}';
    }
}
