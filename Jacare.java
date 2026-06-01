package br.edu.atitus.vinicius_amaral.zoo_digital.animais;

import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Nado;
import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.vinicius_amaral.zoo_digital.especies.Reptil;

public final class Jacare extends Reptil implements Nado, Corrida, Predacao {

    public Jacare(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override public void comer()     { this.comer("peixes e mamíferos"); }
    @Override public void emitirSom() { System.out.println(getNome() + " está rosnando ameaçadoramente!"); }
    @Override public void nadar()     { System.out.println(getNome() + " está deslizando silenciosamente pela água."); }
    @Override public void correr()    { System.out.println(getNome() + " está correndo em curtas distâncias na margem!"); }
    @Override public void cacar()     { System.out.println(getNome() + " está caçando em emboscada na beira do rio."); }
}
