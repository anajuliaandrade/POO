package br.edu.fatecfranca.ex1;

import br.edu.fatecfranca.ex0.CarItem;
import br.edu.fatecfranca.ex0.Product;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private int id;
    private String name, url;
    private List<Message> mensagens;

    public Forum() {
        this.name="";
        this.url="";
        this.mensagens= new ArrayList<Message>();
    }

    public Forum(int id, String url, String name) {
        this.id = id;
        this.url = url;
        this.name = name;
        this.mensagens= new ArrayList<Message>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Message> getMessages() {
        return mensagens;
    }

    public void addMessage(Message message) {
        this.mensagens.add(message);
    }

    @Override
    public String toString() {
        return "Forum{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", messages=" + mensagens +
                '}';
    }
}
