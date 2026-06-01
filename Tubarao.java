package br.edu.atitus.vinicius_amaral.zoo_digital.animais;

import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Nado;
import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.vinicius_amaral.zoo_digital.especies.Peixe;

public final class Tubarao extends Peixe implements Nado, Predacao {

    public Tubarao(String nome, int idade) {
        super(nome, idade, "Salgada");
    }

    @Override public void comer()     { this.comer("focas e peixes grandes"); }
    @Override public void emitirSom() { System.out.println(getNome() + " não emite som audível."); }
    @Override public void nadar()     { System.out.println(getNome() + " está cortando as águas em alta velocidade!"); }
    @Override public void cacar()     { System.out.println(getNome() + " está caçando com olfato apurado pelo sangue na água."); }
}
