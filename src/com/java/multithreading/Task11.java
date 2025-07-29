package com.java.multithreading;

import java.util.Random;

class AnimalRace extends Thread {
    String name;
    Random random = new Random();

    public AnimalRace(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " running... lap " + i);
            try {
                Thread.sleep(random.nextInt(1000)); // Sleep for 0–999 ms
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted.");
            }
        }
        System.out.println(name + " finished!");
    }
}

public class Task11 {
    public static void main(String[] args) {
        Thread tortoise = new AnimalRace("Tortoise");
        Thread rabbit = new AnimalRace("Rabbit");
        Thread dog = new AnimalRace("Dog");

        tortoise.start();
        rabbit.start();
        dog.start();
    }
}
