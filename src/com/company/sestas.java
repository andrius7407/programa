package com.company;

import java.util.Scanner;

/**
 * Created by Andrius on 2017-05-22.
 */
public class sestas {
    private double svoris;
    private double ugis;


    // 1 paprasyti vartotojo ivesti svori
    public void prasymas_kg() {
        System.out.println("iveskite savo svori (kg)");
        Scanner skaneris = new Scanner(System.in);
        svoris = skaneris.nextDouble();
    }

    // 2 paprasyti vartotojo ivesti ugi
    public void prasymas_m() {
        System.out.println("iveskite savo ugi (m)");
        Scanner skaneris = new Scanner(System.in);
        ugis = skaneris.nextDouble();
    }

    // 3 kmi skaiciavimas ir spausdinimas
    public void kmi() {
        double kmi = svoris / (ugis * ugis);
        System.out.println("kmi yra " + kmi);
    }
}
