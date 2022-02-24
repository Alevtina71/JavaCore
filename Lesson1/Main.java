package ru.geekbrains.lesson1;

public class Main {

    public static void main(String[] args) {

        Athlete[] groupOne = new Athlete[4];
        groupOne[0] = new Athlete("Ivan",19, 11.5f);
        groupOne[1] = new Athlete("Semen",20, 10.5f);
        groupOne[2] = new Athlete("Mikhail",18, 12f);
        groupOne[3] = new Athlete("Oleg",19, 11.2f);

        Athlete[] groupTwo = new Athlete[4];
        groupTwo[0] = new Athlete("Olga",20, 12.8f);
        groupTwo[1] = new Athlete("Lena",20, 9.9f);
        groupTwo[2] = new Athlete("Maria",18, 14.5f);
        groupTwo[3] = new Athlete("Sofi",22, 13.5f);


        Team teamOne = new Team(groupOne, "First");
        Team teamTwo = new Team(groupTwo, "Second");


        Course race = new Course();
        race.doit(teamOne);
        race.doit(teamTwo);
    }
}