package br.edu.fatecfranca.ex1;

public class Palco {
    //nao tem extends tem agregacao
    private Ator ator = new AtorFeliz();

    public void altera() {
        if (ator instanceof AtorFeliz){
            ator = new AtorTriste();
        }
        else {
            ator = new AtorFeliz();
        }
    }

    public void atuar() {
        ator.ato(); //polimorfismo, porque dependendo do metodo que ele executar
        // vai executar um system.out.printls diferente.
    }

}
