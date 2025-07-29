package com.basketball;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Witaj w aplikacji symulującej ligę koszykówki!" );
        
        appLoop();
    }

    
    public static void appLoop() {
        // Logika głównej pętli aplikacji
        // Tutaj można dodać interakcję z użytkownikiem, tworzenie lig, drużyn, meczów itp.
        
        // Scanner do odczytu danych wejściowych
        Scanner scanner = new Scanner(System.in);

        // Flaga do kontrolowania pętli aplikacji
        boolean app = true;

        // Pętla aplikacji
        while(app) {
            appMenu();
            String geString = appGetOption(scanner);
            appOption(geString, scanner);
        }


    }

    private static void appOption(String geString, Scanner scanner) {
        if (geString.equals("create_league")) {
            System.out.println("Tworzenie nowej ligi...");
        } else if (geString.equals("add_team")) {
            System.out.println("Dodawanie drużyny do ligi...");
        } else if (geString.equals("start_match")) {
            System.out.println("Rozpoczynanie meczu...");
        } else if (geString.equals("exit")) {
            System.out.println("Zamykanie aplikacji...");
        } else {
            System.out.println("Nieznana komenda.");
        }
    }


    public static void appMenu(){
        System.out.println("Aplikacja działa. Wprowadź komendę lub zakończ aplikację.");
        System.out.println("1. Stwórz nową ligę");
        System.out.println("2. Dodaj drużynę do ligi");
        System.out.println("3. Rozpocznij mecz");
        System.out.println("4. Zakończ aplikację");
    }

    public static String appGetOption(Scanner scanner) {
        return scanner.nextLine();
    }


}
