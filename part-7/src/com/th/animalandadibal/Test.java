package com.th.animalandadibal;

public class Test<edible> {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal s: animals
             ) {
            System.out.println(s.makeSound());
        }

        Edible[] edibles = new Edible[3];
        edibles[0] = new Chicken();
//        edibles[1] = new Fruit();
        edibles[1] = new Apple();
        edibles[2] = new Orange();

        for (Edible c: edibles
             ) {
            System.out.println(c.howtoEat());

        }
        }

    }

