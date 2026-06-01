package br.edu.atitus.vinicius_amaral.zoo_digital.animais;

import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.vinicius_amaral.zoo_digital.especies.Mamifero;

public final class Lobo extends Mamifero implements Corrida, Predacao {

    public Lobo(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override public void comer()     { this.comer("carne de caça"); }
    @Override public void emitirSom() { System.out.println(getNome() + " está uivando para a lua!"); }
    @Override public void correr()    { System.out.println(getNome() + " está correndo em matilha pela floresta!"); }
    @Override public void cacar()     { System.out.println(getNome() + " está caçando em bando com sua matilha."); }
}
