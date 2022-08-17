package main.java.observer;

public class TestJobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java position");
        jobSite.addVacancy("Second Java position");

        Observer observer1 = new Subscriber("Ivan");
        Observer observer2 = new Subscriber("Petr");

        jobSite.addObserver(observer1);
        jobSite.addObserver(observer2);

        jobSite.addVacancy("Second Java position");
        jobSite.addVacancy("First Java position");
    }
}