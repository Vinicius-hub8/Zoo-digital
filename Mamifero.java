package br.edu.atitus.vinicius_amaral.zoo_digital.especies;

public abstract class Mamifero extends Animal {

    private Boolean temPelos;

    public Mamifero(String nome, Integer idade, Boolean temPelos) {
        super(nome, "Mamífero", idade);
        this.temPelos = temPelos;
    }

    public Boolean getTemPelos()          { return temPelos; }
    public void    setTemPelos(Boolean t) { this.temPelos = t; }

    public void amamentar() {
        System.out.println(this.getNome() + " está amamentando seus filhotinhos.");
    }
}
