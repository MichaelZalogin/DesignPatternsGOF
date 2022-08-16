package main.java.strategy;

public class Archer extends Warrior {
    public Archer(int heals, String name) {
        super(heals, name);
    }

    public static void main(String[] args) {
        Archer heroes = new Archer(100, "Elf");
        heroes.setChooseWeapon(new Bow());
        heroes.attack();
    }
}