package com.company;

public class Main {

    public static void main(String[] args) {
	    Vaca leiteira = new Vaca("Malhada");
        System.out.println("Eu sou = " + leiteira.getNome());
        System.out.print("Eu falo = ");
        leiteira.talk();

        Cachorro dalmata = new Cachorro("Pongo");
        System.out.println("Eu sou " + dalmata.getNome());
        System.out.print("Eu falo = ");
        dalmata.talk();

        BemTeVi btv = new BemTeVi("Amarelinho");
        System.out.println("Eu sou " + btv.getNome());
        System.out.println("Eu falo = ");
        btv.talk();
    }
}
