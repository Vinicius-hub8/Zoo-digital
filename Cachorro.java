package br.edu.atitus.vinicius_amaral.zoo_digital.animais;

import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Nado;
import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.vinicius_amaral.zoo_digital.especies.Mamifero;

public final class Cachorro extends Mamifero implements Corrida, Nado, Predacao {

    public Cachorro(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override public void comer()     { this.comer("ração"); }
    @Override public void emitirSom() { System.out.println(getNome() + " está latindo!"); }
    @Override public void nadar()     { System.out.println(getNome() + " está nadando estilo cachorrinho!"); }
    @Override public void correr()    { System.out.println(getNome() + " está correndo por todo o pátio!"); }
    @Override public void cacar()     { System.out.println(getNome() + " está caçando a meia que roubou."); }
}
