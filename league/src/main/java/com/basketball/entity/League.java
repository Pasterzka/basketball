package com.basketball.entity;

public class League {
    private String name;
    private Team[] teams;
    private Match[] matches;
    
    public League(String name, Team[] teams) {
        this.name = name;
        this.teams = teams;
        
        // Liga inicjowana z pustą listą meczów
        this.matches = new Match[0]; 
    }

    public String getName() {
        return name;
    }

    public Team[] getTeams() {
        return teams;
    }

    public Match[] getMatches() {
        return matches;
    }

    public void generateSchedule(){
        int numberOfTeams = teams.length;
        int matchCount = numberOfTeams * (numberOfTeams - 1) / 2; // Każda drużyna gra z każdą raz

        matches = new Match[matchCount];
        int index = 0;
        for (int i = 0; i < numberOfTeams; i++) {
            for (int j = i + 1; j < numberOfTeams; j++) {
                matches[index++] = new Match(teams[i], teams[j]);
            }
        }
    }

}
