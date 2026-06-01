package br.edu.atitus.vinicius_amaral.zoo_digital.especies;

public abstract class Reptil extends Animal {

    private Boolean eVenenoso;

    public Reptil(String nome, Integer idade, Boolean eVenenoso) {
        super(nome, "Réptil", idade);
        this.eVenenoso = eVenenoso;
    }

    public Boolean getEVenenoso()           { return eVenenoso; }
    public void    setEVenenoso(Boolean v)  { this.eVenenoso = v; }

    public void termorregular() {
        System.out.println(this.getNome() + " está se aquecendo ao sol.");
    }
}
