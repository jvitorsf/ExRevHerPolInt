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
        System.out.print("Eu falo = ");
        btv.talk();


        // Exercício 2
        Transporte tran[] = new Transporte[3];
        tran[0] = new Navio(); // Objetos da subclasse
        tran[1] = new Aviao(); // podem pertencer
        tran[2] = new Onibus(); // ao tipo da superclasse.
        System.out.println("Exemplo aplicação polimorfismo.");
        System.out.println("João Vitor, Thiago, Victor");

        for (int i = 0; i < tran.length; i++){
            tran[i].exibeDados(); // Chamada polimórfica do método
        }
    }
}
