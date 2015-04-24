package com.company;

/**
 * Created by joaovitor on 4/24/15.
 */
public abstract class Animal {
    private String nome;

    public Animal(String n){
        nome = n;
    }

    public String getNome() {
        return nome;
    }

    public abstract void talk();
}
