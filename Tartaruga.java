package br.edu.atitus.vinicius_amaral.zoo_digital.animais;

import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Nado;
import br.edu.atitus.vinicius_amaral.zoo_digital.especies.Reptil;

public final class Tartaruga extends Reptil implements Nado {

    public Tartaruga(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override public void comer()     { this.comer("algas e medusas"); }
    @Override public void emitirSom() { System.out.println(getNome() + " está fazendo um som gutural suave."); }
    @Override public void nadar()     { System.out.println(getNome() + " está nadando graciosamente pelo oceano."); }
}
