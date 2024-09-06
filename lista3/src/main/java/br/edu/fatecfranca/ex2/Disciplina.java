package br.edu.fatecfranca.ex2;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private int id;
    private String name, sigla;
    private List<Aluno> alunos;
    private Professor professor;

    public Disciplina() {
        this.alunos = new ArrayList<Aluno>();
    }

    public Disciplina(int id, String name, String sigla, Professor professor) {
        this.id = id;
        this.name = name;
        this.sigla = sigla;
        this.professor = professor;
        this.alunos = new ArrayList<Aluno>();
    }

    //getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSigla() {
        return sigla;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setName(String name) {
        this.name = name;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    //adiciona um aluno em alunos
    public void addAluno (Aluno aluno){
        this.alunos.add(aluno);
    }

    @Override
    public String toString() {
        return "\nDisciplina{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sigla='" + sigla + '\'' +
                ", alunos=" + alunos +
                ", professor=" + professor +
                '}';
    }
}
