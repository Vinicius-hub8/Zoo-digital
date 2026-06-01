package br.edu.atitus.vinicius_amaral.zoo_digital.animais;

import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Voo;
import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.vinicius_amaral.zoo_digital.especies.Mamifero;

public final class Morcego extends Mamifero implements Voo, Predacao {

    public Morcego(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override public void comer()     { this.comer("insetos"); }
    @Override public void emitirSom() { System.out.println(getNome() + " está emitindo ultrassons!"); }
    @Override public void voar()      { System.out.println(getNome() + " está voando à noite silenciosamente!"); }
    @Override public void cacar()     { System.out.println(getNome() + " está caçando insetos em pleno voo."); }
}
