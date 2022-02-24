package ru.geekbrains.lesson1;

public class Course {
    private int[] course = {100, 100, 100, 100};

    public void doit(Team team) {
        double result = 0;
        double totalResult = 0;
        for (int i = 0; i< course.length; i++) {
            for (int j = 0; j < team.getTeam().length; j++) {
                result = course[i]/team.getTeam()[i].getAverageSpeed();
            }
            System.out.println("The result of " + team.getTeam()[i].getName() + " from the team "+ team.getTeamName() + " is " + result);
            totalResult += result;
        }
        System.out.println("The total result of " + team.getTeamName() + " is " +totalResult);
    }
}
