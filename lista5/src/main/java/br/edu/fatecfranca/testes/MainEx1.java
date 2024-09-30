package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.ex1.Cidade;
import br.edu.fatecfranca.ex1.Empregado;
import br.edu.fatecfranca.ex1.Pessoa;

public class MainEx1 {
    public static void main(String[] args) {
        //primeiro teste ->
        Pessoa p1 = new Pessoa();
        p1.ensina();
        p1.vota();
        p1.trabalha();
        p1.getCPF();
        p1.getRg();
        p1.pagaIr();
        p1.come();
        p1.respira();

        //segundo teste ->
        Pessoa ana = new Pessoa();
        Cidade franca = new Cidade();
        franca.contrata(ana);
        franca.contrata((Empregado) ana);
        franca.cobraDe(ana);
        franca.registra(ana);
        franca.alimenta(ana);
    }
}
