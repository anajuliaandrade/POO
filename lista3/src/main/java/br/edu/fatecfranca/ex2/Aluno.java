package br.edu.fatecfranca.ex2;

public class Aluno {
     private int ra;
     private String name, username;

    public Aluno() {

    }

    public Aluno(int ra, String name, String username) {
        this.ra = ra;
        this.name = name;
        this.username = username;
    }
    //getters
    public int getRa() {
        return ra;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    //setters

    public void setRa(int ra) {
        this.ra = ra;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "\nAluno{" +
                "ra=" + ra +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
