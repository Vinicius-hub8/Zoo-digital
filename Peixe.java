package br.edu.atitus.vinicius_amaral.zoo_digital.especies;

public abstract class Peixe extends Animal {

    private String tipoAgua;

    public Peixe(String nome, int idade, String tipoAgua) {
        super(nome, "Peixe", idade);
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua()          { return tipoAgua; }
    public void   setTipoAgua(String t)  { this.tipoAgua = t; }
}
