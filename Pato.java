package br.edu.atitus.vinicius_amaral.zoo_digital.animais;

import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Nado;
import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Voo;
import br.edu.atitus.vinicius_amaral.zoo_digital.especies.Ave;

public final class Pato extends Ave implements Corrida, Nado, Voo {

    public Pato(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override public void comer()     { this.comer("plantinhas do lago"); }
    @Override public void emitirSom() { System.out.println(getNome() + " está grasnando!"); }
    @Override public void voar()      { System.out.println(getNome() + " está voando em migração para o Sul!"); }
    @Override public void nadar()     { System.out.println(getNome() + " está nadando elegantemente!"); }
    @Override public void correr()    { System.out.println(getNome() + " está correndo todo atrapalhado!"); }
}
