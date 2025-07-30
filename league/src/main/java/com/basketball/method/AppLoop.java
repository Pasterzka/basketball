package com.basketball.method;

import java.util.ArrayList;
import java.util.Scanner;

import com.basketball.entity.League;
import com.basketball.entity.Team;

public class AppLoop {
    static Scanner scanner = new Scanner(System.in);
    static String getString;
    
    // Flaga do kontrolowania pętli aplikacji
    boolean app = true;

    // Lista drużyn
    ArrayList<Team> teams = new ArrayList<>();

    League league;

    public void appLoop() {
        // Logika głównej pętli aplikacji



        // Pętla aplikacji
        while(app) {
            appMenu();
            appOption();
        }

        // Zamykanie skanera i kończenie aplikacji
        scanner.close();
        System.exit(0);
    }

    //Wybór opcji w aplikacji
    private void appOption() {
        if (getString.equals("1")) {
            appAddTeam();
        }else if (getString.equals("2")) {
            appRemoveTeam(); 
        }else if (getString.equals("3")) {
            appSeeTeams();  
        }else if (getString.equals("4")) {
            appCreateLeague();
        }else if (getString.equals("5")) {
            appExit();  
        }else{
            System.out.println("Błedna opcja. Wybierz ponownie.");
        }
    }

    //Dodawanie drużyny
    private void appAddTeam() {
        
        System.out.println("Dodawanie drużyny...");
        
        // Logika dodawania drużyny
        String teamName;
        System.out.print("Podaj nazwę drużyny: ");
        teamName = scanner.nextLine();

        String teamCity;
        System.out.print("Podaj nazwę miasta drużyny: ");
        teamCity = scanner.nextLine();

        Team newTeam = new Team(teamName, teamCity);

        teams.add(newTeam);

        System.out.println("Dodano drużynę: " + newTeam.toString() + "!");
        System.out.println("Aktualna liczba drużyn: " + teams.size());

        System.out.println("Wciśnij Enter, aby kontynuować...");
        scanner.nextLine();

    }

    //Usuwanie drużyny
    private void appRemoveTeam() {
        if (teams.isEmpty()) {
            System.out.println("Brak drużyn do usunięcia.");

        }else {
             System.out.println("Wybierz numer drużyny do usunięcia:");
            for (int i = 0; i < teams.size(); i++) {
                System.out.println((i + 1) + ". " + teams.get(i));
            }

            System.out.print("Podaj numer: ");
            String input = scanner.nextLine();

            try {
                int idx = Integer.parseInt(input) - 1;
                if (idx >= 0 && idx < teams.size()) {
                    Team removed = teams.remove(idx);
                    System.out.println("Usunięto drużynę: " + removed);
                } else {
                    System.out.println("Nieprawidłowy numer drużyny.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nieprawidłowy format numeru.");
            }
        }

        System.out.println("Wciśnij Enter, aby kontynuować...");
        scanner.nextLine();
    }

    //Wyświetlanie drużyn
    private void appSeeTeams() {
        System.out.println("Wyświetlanie drużyn...");
        int i = 1;
        if (teams.isEmpty()) {
            System.out.println("Brak drużyn w lidze.");
        }else{
            for (Team team : teams) {
            System.out.println(i + ". " + team.toString());
            i++;
            }
        }

        System.out.println("Wciśnij Enter, aby kontynuować...");
        scanner.nextLine();
    }

    //Tworzenie ligi
    private void appCreateLeague() {
        if (teams.size() < 2) {
            System.out.println("Nie można utworzyć ligi. Potrzebujesz co najmniej dwóch drużyn.");
        } else {
            System.out.println("Tworzenie ligi...");

            String leagueName;
            System.out.print("Podaj nazwę ligi: ");
            leagueName = scanner.nextLine();

            league = new League(leagueName, teams);
            System.out.println("Liga została utworzona z " + teams.size() + " drużynami.");

            league.generateSchedule();
            league.printSchedule();
        }

        System.out.println("Wciśnij Enter, aby kontynuować...");
        scanner.nextLine();
    }

    //Zamykanie aplikacji
    private void appExit() {
        app = false;
        System.out.println("Zamykanie aplikacji...");
        
    }

    //Menu aplikacji
    public static void appMenu(){
        System.out.println("Aplikacja działa. Wprowadź numer opcji.");
        System.out.println("1. Dodaj drużynę.");
        System.out.println("2. Usuń drużynę.");
        System.out.println("3. Wyświetl drużyny.");
        System.out.println("4. Stwórz ligę.");
        System.out.println("5. Zakończ aplikację");
        getString = scanner.nextLine();
    }
}
