package com.company;

public class DinosaurSupervisor {

    public static void main(String[] args) {

        //Create dinosaur objects
        Dinosaur trex = new Dinosaur();
        Dinosaur velociraptor = new Dinosaur();
        Dinosaur diplodocus = new Dinosaur();

        //Call roar methods
        trex.roar();
        velociraptor.roar();
        diplodocus.roar();

    }
}
