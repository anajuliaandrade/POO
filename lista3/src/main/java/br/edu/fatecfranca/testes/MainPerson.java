package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.ex1.Forum;
import br.edu.fatecfranca.ex1.Message;
import br.edu.fatecfranca.ex1.Person;

public class MainPerson {
    public static void main(String[] args){
        Person pessoa1 = new Person(1, "Ana Júlia", "anajulia");
        Message msg1 = new Message(1,"olá Ana!", pessoa1 );
        Forum forum1 = new Forum(1, "1234", "forum");
        forum1.addMessage(msg1);
        System.out.println(forum1);

    }
}
