package com.basketball.entity;

import java.util.ArrayList;

public class League {
    private String name;
    private ArrayList<Team> teams;
    private ArrayList<Match> matches;
    
    public League(String name, ArrayList<Team> teams) {
        this.name = name;
        this.teams = teams;
        
        // Liga inicjowana z pustą listą meczów
        this.matches = new ArrayList<>();
    
    }

    public String getName() {
        return name;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }

    public void generateSchedule(){
        int numberOfTeams = teams.size();
        int matchCount = numberOfTeams * (numberOfTeams - 1) / 2; // Każda drużyna gra z każdą raz

        matches = new ArrayList<>(matchCount);
        for (int i = 0; i < numberOfTeams; i++) {
            for (int j = i + 1; j < numberOfTeams; j++) {
                matches.add(new Match(teams.get(i), teams.get(j)));
            }
        }
    }

    public void printSchedule() {
    if (matches == null || matches.size() == 0) {
        System.out.println("Terminarz jest pusty. Najpierw wygeneruj terminarz.");
        return;
    }
    
    System.out.println("Terminarz ligi " + name + ":");
    for (int i = 0; i < matches.size(); i++) {
        System.out.println((i + 1) + ". " + matches.get(i).getHomeTeam().toString() + " vs " + matches.get(i).getAwayTeam().toString());
    }
}

}
