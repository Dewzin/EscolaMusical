package org.example;

public class Bateria extends Instrumentos {
    private int numeroPecas;
    public Bateria (String nome, String material, int numeroPecas) {
        super (nome, material);
        this.numeroPecas = numeroPecas;
    }
    
    @Override
    public void tocar() {
        System.out.println("Um ritmo animado " + nome + " com " + numeroPecas + " peças");
    }
    
    @Override
    public void afinar () {
        super.afinar();
        System.out.println("afinando a Bateria ");
    }
    public void MostrarInformacoes () {
        super.MostrarInformacoes();
        System.out.println("Numero de peças: " + numeroPecas);
    }
}
