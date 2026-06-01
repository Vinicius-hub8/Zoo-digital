package br.edu.atitus.vinicius_amaral.zoo_digital.animais;

import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Voo;
import br.edu.atitus.vinicius_amaral.zoo_digital.especies.Ave;

public final class Papagaio extends Ave implements Voo {

    public Papagaio(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override public void comer()     { this.comer("frutas e sementes"); }
    @Override public void emitirSom() { System.out.println(getNome() + " está falando: Loro quer biscoito!"); }
    @Override public void voar()      { System.out.println(getNome() + " está voando entre as copas das árvores!"); }
}
