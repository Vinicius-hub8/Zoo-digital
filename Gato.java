package br.edu.atitus.vinicius_amaral.zoo_digital.animais;

import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Nado;
import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.vinicius_amaral.zoo_digital.especies.Mamifero;

public final class Gato extends Mamifero implements Corrida, Nado, Predacao {

    public Gato(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override public void comer()     { this.comer("carne"); }
    @Override public void emitirSom() { System.out.println(getNome() + " está miando!"); }
    @Override public void nadar()     { System.out.println(getNome() + " está nadando apavorado!"); }
    @Override public void correr()    { System.out.println(getNome() + " está correndo pelo telhado!"); }
    @Override public void cacar()     { System.out.println(getNome() + " está caçando passarinhos no quintal."); }
}
