package br.edu.fatecfranca.ex3;

import br.edu.fatecfranca.ex1.Message;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private int id;
    private String origem, destino;
    private List<Reservation> reservas;

    public Flight() {
        this.origem="";
        this.destino="";
        this.reservas = new ArrayList<Reservation>();
    }

    public Flight(int id, String destino, String origem) {
        this.destino = destino;
        this.id = id;
        this.origem = origem;
        this.reservas = new ArrayList<Reservation>();
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public List<Reservation> getReservas() {
        return reservas;
    }

    public void addReservas(Reservation reservation) {
        this.reservas.add(reservation);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "destino='" + destino + '\'' +
                ", id=" + id +
                ", origem='" + origem + '\'' +
                ", reservas=" + reservas +
                '}';
    }
}
