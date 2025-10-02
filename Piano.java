package org.example;

    public class Piano extends Instrumentos{
        private int numeroCordas;
        public Piano(String nome, String material, int numeroCordas) {
            super (nome, material);
            this.numeroCordas = numeroCordas;
        }
        
        @Override
        public void tocar() {
            System.out.println("Soando uma bela melodia no " + nome + " com " + numeroCordas + " cordas");
        }
        @Override
        public void afinar () {
            super.afinar();
            System.out.println("ajustando as cordas internas do piano");
        }
}
