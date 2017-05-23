package com.company;

import java.util.Scanner;

/**
 * Created by Andrius on 2017-05-23.
 */
public class trecias {
    private int skaicius1;
    private int skaicius2;

    // 1 paprasyti vartotojo ivesti pirma skaiciu
    public void prasymas1() {
        System.out.println("iveskite pirma skaiciu");
        Scanner skaneris = new Scanner(System.in);
        skaicius1 = skaneris.nextInt();
    }

    // 2 paprasyti vartotojo ivesti antra skaiciu
    public void prasymas2() {
        System.out.println("iveskite antra skaiciu");
        Scanner skaneris = new Scanner(System.in);
        skaicius2 = skaneris.nextInt();
    }

    // 3 suskaiciuoti suma ir skirtuma
    public void skaiciavimas() {
        int suma = skaicius1 + skaicius2;
        System.out.println("suma yra " + suma);
        int skirtumas = skaicius1 - skaicius2;
        System.out.println("skirtumas yra " + skirtumas);
    }

}
