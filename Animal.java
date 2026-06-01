package br.edu.atitus.vinicius_amaral.zoo_digital.especies;

public abstract class Animal {

    private static int contador = 0;

    public static int getContador() {
        return contador;
    }

    public final String VERSAO_APP = "2.5";

    private String nome;
    private String especie;
    private Integer idade;

    public Animal(String nome, String especie, Integer idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        Animal.contador++;
    }

    public String getNome()          { return nome; }
    public void   setNome(String n)  { this.nome = n; }
    public String getEspecie()       { return especie; }
    public void   setEspecie(String e){ this.especie = e; }
    public Integer getIdade()        { return idade; }
    public void    setIdade(Integer i){ this.idade = i; }

    public void comer() {
        this.comer("alguma coisa");
    }

    public final void comer(String alimento) {
        System.out.println(this.getNome() + " está comendo " + alimento);
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome()
             + " | Idade: " + this.getIdade() + " anos"
             + " | Espécie: " + this.getEspecie();
    }

    public abstract void emitirSom();
}
