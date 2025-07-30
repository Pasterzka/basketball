package com.basketball;

import com.basketball.method.AppLoop;

public class App 
{
    public static void main( String[] args )
    {
        AppLoop appLoop = new AppLoop();

        System.out.println( "Witaj w aplikacji symulującej ligę koszykówki!" );
        
        appLoop.appLoop();

    }

}
