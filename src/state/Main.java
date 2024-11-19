package state;

import state.model.Pacote;

public class Main {
    public static void main(String[] args) {
        Pacote pacote = new Pacote();

        System.out.println(pacote.getEstado());

        pacote.proximaEstado();
        System.out.println(pacote.getEstado());

        pacote.proximaEstado();
        System.out.println(pacote.getEstado());
    }
}