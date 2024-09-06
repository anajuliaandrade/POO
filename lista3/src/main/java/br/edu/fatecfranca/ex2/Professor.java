package br.edu.fatecfranca.ex2;

public class Professor {
     private int id;
     private String name, username;

    public Professor() {

    }

    public Professor(int id, String name, String username) {
        this.id = id;
        this.name = name;
        this.username = username;
    }
    //getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "\nProfessor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
