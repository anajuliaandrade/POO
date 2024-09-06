package br.edu.fatecfranca.testes;
import br.edu.fatecfranca.ex2.Curso;
import br.edu.fatecfranca.ex2.Disciplina;
import br.edu.fatecfranca.ex2.Aluno;
import br.edu.fatecfranca.ex2.Professor;

public class MainCurso {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno (1234, "Ana Júlia Andrade", "anajulia");
        Aluno aluno2 = new Aluno (5678, "Rafaela Aparecida", "rafa");
        Aluno aluno3 = new Aluno (9101, "Guilherme Silva", "guilherme");
        Professor prof1 = new Professor(123, "Daniel Fulano", "daniel");
        Professor prof2 = new Professor(456, "Jaqueline Bligadori", "jaqueline");

        Curso curso1 = new Curso (1, "ADS", "Exatas");
        curso1.addDisciplina(1, "POO", "ILPOO", prof1);
        curso1.addAluno(aluno1, 1);
        curso1.addAluno(aluno2, 1);
        System.out.println(curso1);
    }
}
