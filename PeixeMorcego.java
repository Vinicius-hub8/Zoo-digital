package br.edu.atitus.vinicius_amaral.zoo_digital.animais;

import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Nado;
import br.edu.atitus.vinicius_amaral.zoo_digital.especies.Peixe;

public final class PeixeMorcego extends Peixe implements Nado {

    public PeixeMorcego(String nome, int idade) {
        super(nome, idade, "Salgada");
    }

    @Override public void comer()     { this.comer("pequenas algas"); }
    @Override public void emitirSom() { System.out.println(getNome() + " está borbulhando."); }
    @Override public void nadar()     { System.out.println(getNome() + " está nadando tranquilamente."); }
}
