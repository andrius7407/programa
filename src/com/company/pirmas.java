package com.company;

import java.util.Scanner;

/**
 * Created by Andrius on 2017-05-23.
 */
public class pirmas {
    private String vardas;

    // 1 paprasyti vartotojo ivesti varda
    public void pasisveikinimas() {
        System.out.println("iveskite vartotojo varda");
    }

    // 2 nuskaityti vart varda
    public void nuskaitymas() {
        Scanner skaneris = new Scanner(System.in);
        vardas = skaneris.nextLine();
    }
        // 3 atspausdinti ji 5 kartus

    public void spausdinimas() {
        for (int i = 0; i < 5; i++) {
            System.out.println(vardas);
        }
    }
}