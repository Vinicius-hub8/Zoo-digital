package br.edu.atitus.vinicius_amaral.zoo_digital.animais;

import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Nado;
import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.vinicius_amaral.zoo_digital.especies.Ave;

public final class Pinguim extends Ave implements Nado, Predacao {

    public Pinguim(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override public void comer()     { this.comer("peixes"); }
    @Override public void emitirSom() { System.out.println(getNome() + " está grasnando!"); }
    @Override public void nadar()     { System.out.println(getNome() + " está nadando atrás de peixes!"); }
    @Override public void cacar()     { System.out.println(getNome() + " está caçando krill no gelo."); }
}
