package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.ex3.Flight;
import br.edu.fatecfranca.ex3.Passenger;
import br.edu.fatecfranca.ex3.Reservation;

public class MainFlight {
    public static void main(String[] args){
        Passenger passageiro1 = new Passenger(1, "Ana Júlia", "459-441-658-63");
        Reservation reserva1 = new Reservation(1, passageiro1, "08/10/2024");
        Flight voo1 = new Flight(1, "Rio de Janeiro", "Campinas");
        voo1.addReservas(reserva1);
        System.out.println(voo1);
    }
}
