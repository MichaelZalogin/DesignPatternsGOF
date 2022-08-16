package main.java.strategy;

public class Warrior {
    private int heals;
    private String name;
    private Hitable chooseWeapon;

    public Warrior(int heals, String name) {
        this.heals = heals;
        this.name = name;
    }

    public int getHeals() {
        return this.heals;
    }

    public String getName() {
        return this.name;
    }

    public void move() {
        System.out.println("Warrior move");
    }

    public void setChooseWeapon(Hitable chooseWeapon) {
        this.chooseWeapon = chooseWeapon;
    }

    public void attack() {
        this.chooseWeapon.hit();
    }
}