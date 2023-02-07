package com.company.Lesson1;

public class Team {

    protected String nameTeam;
    protected Going[] walkers;

    public Team(String nameTeam, Going... walkers) {
        this.nameTeam = nameTeam;
        this.walkers = walkers;
    }

    public Going[] getWalkers() {
        return walkers;
    }

    public void showResults() {
        System.out.println("Результат команды: " + nameTeam);
        for (Going going : walkers) {
            going.result();
        }
    }
}
