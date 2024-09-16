package br.edu.fatecfranca.ex4;

import java.util.Random;

public class Jogo {
    private static final Random random = new Random();

    public static Coisa sorteiaCoisa() {
        int escolha = random.nextInt(3); // Gera um número entre 0 e 2
        switch (escolha) {
            case 0: return new Pedra();
            case 1: return new Papel();
            case 2: return new Tesoura();
            default: return null; //obter coisa aleatoria
        }
    }

    public static void jogar1() {
        Coisa coisa1 = sorteiaCoisa();
        Coisa coisa2 = sorteiaCoisa();

        System.out.println("Jogador 1 escolheu: " + coisa1);
        System.out.println("Jogador 2 escolheu: " + coisa2);

        if (coisa1.vence(coisa2)) {
            System.out.println(coisa1 + " vence " + coisa2);
        } else if (coisa2.vence(coisa1)) {
            System.out.println(coisa2 + " vence " + coisa1);
        } else {
            System.out.println("Empate!");
        }
    }
    public void jogar(){
        while (true) {
            jogar1();
            break;
        }
    }
}
