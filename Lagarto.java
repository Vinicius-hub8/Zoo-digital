package br.edu.atitus.vinicius_amaral.zoo_digital.animais;

import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.vinicius_amaral.zoo_digital.especies.Reptil;

public final class Lagarto extends Reptil implements Corrida {

    public Lagarto(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override public void comer()     { this.comer("insetos e pequenos invertebrados"); }
    @Override public void emitirSom() { System.out.println(getNome() + " está silvando levemente."); }
    @Override public void correr()    { System.out.println(getNome() + " está correndo rapidamente pelas pedras!"); }
}
