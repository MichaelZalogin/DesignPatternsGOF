package main.java.strategy;

public class Bow implements Hitable {
    @Override
    public void hit() {
        System.out.println("Bow shot");
    }
}