package br.edu.atitus.vinicius_amaral.zoo_digital.animais;

import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Nado;
import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.vinicius_amaral.zoo_digital.especies.Peixe;

public final class Traira extends Peixe implements Nado, Predacao {

    public Traira(String nome, int idade) {
        super(nome, idade, "Doce");
    }

    @Override public void comer()     { this.comer("lambaris"); }
    @Override public void emitirSom() { System.out.println(getNome() + " está borbulhando."); }
    @Override public void nadar()     { System.out.println(getNome() + " está nadando no rio."); }
    @Override public void cacar()     { System.out.println(getNome() + " está caçando lambaris com bote rápido."); }
}
