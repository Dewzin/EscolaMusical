package org.example;

public class Violino extends Instrumentos {
        private int numeroCordas;
       public Violino (String nome, String material, int numeroCordas) {
           super(nome, material);
           this.numeroCordas = numeroCordas;
       }     

        @Override
        public void tocar() {
            System.out.println("Emite notas agudas e vibrantes " + nome + "com " + numeroCordas + "cordas");
        }
        @Override
        public void afinar () {
            super.afinar();
            System.out.println("ajustando as cordas " + numeroCordas);
        }
        @Override
        public void MostrarInformacoes () {
            super.MostrarInformacoes ();
            System.out.println("Numero de cordas: " + numeroCordas);

        }

    }
