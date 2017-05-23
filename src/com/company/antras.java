package com.company;

import java.util.Scanner;

/**
 * Created by Andrius on 2017-05-23.
 */
public class antras {
    private String zodis;

    // 1 paprasyti vartotojo ivesti zodi
    public void pasisveikinimas() {
        System.out.println("iveskite zodi");
    }

    // 2 nuskaityti vartotojo zodi
    public void nuskaitymas() {
        Scanner skaneris = new Scanner(System.in);
        zodis = skaneris.nextLine();
    }

    // 3 suskaiciuoti raidziu skaiciu ir atspausdinti
    public void skaiciavimas() {
        System.out.println(zodis.length());
    }
}
