package ru.geekbrains.lesson1;

public class Team {
    String teamName;
    Athlete[] team;


    public Team(Athlete[] team, String teamName) {
        this.teamName = teamName;
        this.team = team;
    }

    public String getTeamName() {
        return teamName;
    }

    public Athlete[] getTeam() {
        return team;
    }
}
