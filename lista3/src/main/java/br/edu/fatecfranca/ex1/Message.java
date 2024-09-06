package br.edu.fatecfranca.ex1;

public class Message {
    private int id;
    private String msg;
    private Person pessoa;

    public Message() {
        this.msg="";
    }

    public Message(int id, String text, Person pessoa) {
        this.id = id;
        this.msg = text;
        this.pessoa = pessoa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return msg;
    }

    public void setText(String text) {
        this.msg = text;
    }

    public Person getPessoa() {
        return pessoa;
    }

    public void setPessoa(Person pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", pessoa=" + pessoa +
                '}';
    }
}
