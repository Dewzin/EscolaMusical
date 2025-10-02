package org.example;

public class Main {
    public static void main(String[] args) {

        Instrumentos[] orquestra = new Instrumentos[4];

        orquestra[0] = new Piano("Piano", "Madeira", 230);
        orquestra[1] = new Violao("Violão", "Madeira", 6);
        orquestra[2] = new Violino("Violino", "Madeira", 4);
        orquestra[3] = new Bateria("Bateria", "Metal", 6);

        System.out.println("Informações dos instrumentos:");
        for (Instrumentos instrumento : orquestra) {
            instrumento.mostrarInformacoes();
        }
        
        System.out.println("Afinando os instrumentos...");
        for (Instrumentos instrumento : orquestra) {
            instrumento.afinar();
        }

        System.out.println("A orquestra está começando a tocar!");
        for (Instrumentos instrumento : orquestra) {
            instrumento.tocar();
        }

    }
}
