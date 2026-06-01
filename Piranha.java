package br.edu.atitus.vinicius_amaral.zoo_digital.animais;

import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Nado;
import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.vinicius_amaral.zoo_digital.especies.Peixe;

public final class Piranha extends Peixe implements Nado, Predacao {

    public Piranha(String nome, int idade) {
        super(nome, idade, "Doce");
    }

    @Override public void comer()     { this.comer("carne"); }
    @Override public void emitirSom() { System.out.println(getNome() + " está borbulhando agressivamente."); }
    @Override public void nadar()     { System.out.println(getNome() + " está nadando em cardume frenético."); }
    @Override public void cacar()     { System.out.println(getNome() + " está caçando em cardume com dentadas precisas."); }
}
