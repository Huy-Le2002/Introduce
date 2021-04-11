package com.th.animalandadibal;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken:Cuctac cuctac!";
    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }
}
