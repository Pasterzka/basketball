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
