package org.example;

public class Violao extends Instrumentos{
    private int numeroCordas;
    public Violao (String nome, String material, int numeroCordas) {
        super(nome, material);
        this.numeroCordas = numeroCordas;
    }

    @Override
    public void tocar() {
        System.out.println("Toca acordes acústicos " + nome + " com " + numeroCordas + " cordas");
    }
    @Override
    public void afinar () {
        super.afinar();
        System.out.println("ajustando as cordas ");
    }
    public void MostrarInformacoes () {
        super.MostrarInformacoes ();
        System.out.println("Numero de cordas: " + numeroCordas);
    }
}
