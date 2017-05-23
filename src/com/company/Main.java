package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner skaneris = new Scanner(System.in);
        System.out.println("labas, kuria uzduoti vykdyti?(ivesti 1-6)");
        int numeris = skaneris.nextInt();
        switch (numeris) {
            // write your code here
            case 1:
                pirmas objektas1 = new pirmas();
                objektas1.pasisveikinimas();
                objektas1.nuskaitymas();
                objektas1.spausdinimas();
                break;

            case 2:
                antras objektas2 = new antras();
                objektas2.pasisveikinimas();
                objektas2.nuskaitymas();
                objektas2.skaiciavimas();
                break;

            case 3:
                trecias objektas3 = new trecias();
                objektas3.prasymas1();
                objektas3.prasymas2();
                objektas3.skaiciavimas();
                break;

            case 4:
                ketvirtas objektas4 = new ketvirtas();
                objektas4.prasymas1();
                objektas4.prasymas2();
                objektas4.suma();
                objektas4.skirtumas();
                break;

            case 5:
                penktas objektas5 = new penktas();
                objektas5.prasymas1();
                objektas5.prasymas2();
                objektas5.vykdyk();
                break;


            case 6:
                sestas objektas6 = new sestas();
                objektas6.prasymas_kg();
                objektas6.prasymas_m();
                objektas6.kmi();
                break;
                // write your code here
        }
    }
}