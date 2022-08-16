package main.java.strategy;

public class Knife implements Hitable {
    @Override
    public void hit() {
        System.out.println("Knife hit");
    }
}