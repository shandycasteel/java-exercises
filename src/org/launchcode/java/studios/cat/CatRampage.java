package org.launchcode.java.studios.cat;

public class CatRampage {

    public static void main(String[] args) {

        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();

        System.out.println(garfield.noise());

    }
}
