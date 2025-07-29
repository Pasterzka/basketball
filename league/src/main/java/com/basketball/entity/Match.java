package com.basketball.entity;

import java.io.Console;

public class Match {
    private Team homeTeam;
    private Team awayTeam;
    private int homeScore;
    private int awayScore;

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = 0;
        this.awayScore = 0;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public void getResult(){
        if (homeScore > awayScore) {
            homeTeam.addWin();
            awayTeam.addLoss();

            // Wypisanie informacji o zwycięzcy
            System.out.println("Zwycięzca: " + homeTeam.toString() + " z wynikiem " + homeScore + " - " + awayScore + " przeciwko " + awayTeam.toString() + ".");
        } else if (awayScore > homeScore) {
            awayTeam.addWin();
            homeTeam.addLoss();

            // Wypisanie informacji o zwycięzcy
            System.out.println("Zwycięzca: " + awayTeam.toString() + " z wynikiem " + awayScore + " - " + homeScore + " przeciwko " + homeTeam.toString() + ".");
        }
        homeTeam.addPoints(homeScore);
        awayTeam.addPoints(awayScore);
    }
}
