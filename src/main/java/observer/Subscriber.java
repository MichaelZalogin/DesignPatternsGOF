package main.java.observer;

import java.util.List;

public class Subscriber implements Observer{
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + getName() + ". We have some changes in vacancies." + vacancies);
    }
}
