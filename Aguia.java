package br.edu.atitus.vinicius_amaral.zoo_digital.animais;

import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Voo;
import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.vinicius_amaral.zoo_digital.especies.Ave;

public final class Aguia extends Ave implements Voo, Predacao {

    public Aguia(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override public void comer()     { this.comer("coelhos e roedores"); }
    @Override public void emitirSom() { System.out.println(getNome() + " está soltando um grito estridente!"); }
    @Override public void voar()      { System.out.println(getNome() + " está planando majestosamente nas alturas!"); }
    @Override public void cacar()     { System.out.println(getNome() + " está mergulhando em picada para capturar a presa."); }
}
