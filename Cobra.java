package br.edu.atitus.vinicius_amaral.zoo_digital.animais;

import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.vinicius_amaral.zoo_digital.especies.Reptil;

public final class Cobra extends Reptil implements Predacao {

    public Cobra(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override public void comer()     { this.comer("ratos e anfíbios"); }
    @Override public void emitirSom() { System.out.println(getNome() + " está sibilando!"); }
    @Override public void cacar()     { System.out.println(getNome() + " está caçando com veneno e bote relâmpago."); }
}
