package com.basketball.entity;

public class Team {
    private String name;
    private String city;
    private int wins;
    private int losses;
    private int points;

    public Team(String name, String city) {
        this.name = name;
        this.city = city;
        this.wins = 0;
        this.losses = 0;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public String getCity() {
        return city;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    public void addWin() {
        this.wins++;
    }

    public void addLoss() {
        this.losses++;
    }
    
    @Override
    public String toString() {
        return name + " " + city;
    }
}
