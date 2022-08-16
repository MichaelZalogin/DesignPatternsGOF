package main.java.strategy;

public class Sword implements Hitable {
    @Override
    public void hit() {
        System.out.println("Sword hit");
    }
}