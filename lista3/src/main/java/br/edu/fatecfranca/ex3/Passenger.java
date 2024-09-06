package br.edu.fatecfranca.ex3;

public class Passenger {
    private int id;
    private String name, cpf;

    public Passenger() {
        this.name="";
        this.cpf="";
    }
    public Passenger( int id, String name, String cpf) {
        this.cpf = cpf;
        this.id = id;
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "cpf='" + cpf + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
