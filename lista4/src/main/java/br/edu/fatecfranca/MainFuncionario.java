package br.edu.fatecfranca;
import br.edu.fatecfranca.ex0.Assistente;
import br.edu.fatecfranca.ex0.Diretor;
import br.edu.fatecfranca.ex0.Funcionario;
import br.edu.fatecfranca.ex0.Gerente;

import java.util.ArrayList;
import java.util.List;

public class MainFuncionario {

    public static void calculaFolhaPgto (List<Funcionario> funcionarios){
        float soma = 0;
        for(Funcionario funcionario: funcionarios){
            funcionario.calculaSalario();
            soma += funcionario.calculaSalario();
        }
        System.out.println("O total da folha de pagamento é: R$" + soma);
    }

    public static void polimorfismo (Funcionario funcionario){
        System.out.println(funcionario.toString());
    }

    public static void main(String[] args) {
        Assistente assistente1 = new Assistente("Ana Julia", 150.0f,
                "45678912358", "Franca", 10.0f);
        assistente1.calculaSalario();
        polimorfismo(assistente1);

        Gerente gerente1 = new Gerente("Guilherme", 200.0f, "12345678985",
                "Franca", 400.0f);
        gerente1.calculaSalario();
        polimorfismo(gerente1);

        Diretor diretor1 = new Diretor("Carlos", 1000.0f, "78945612332",
                "Pedregulho", 10.0f);
        diretor1.calculaSalario();
        polimorfismo(diretor1);

        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(assistente1);
        funcionarios.add(gerente1);
        funcionarios.add(diretor1);
        calculaFolhaPgto(funcionarios);


    }
}