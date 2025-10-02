package org.example;

public abstract class Instrumentos {
    protected String nome;
    protected String material;

    public Instrumentos (String nome, String material) {
        this.nome = nome;
        this.material = material;
    }

    public abstract void tocar ();

    public void afinar () {
        System.out.println("Afinando o " + nome + "...");
    }

    public void MostrarInformacoes() {
        System.out.println("Instrumento: " + nome);
        System.out.println("Material" + material);
    }
}
