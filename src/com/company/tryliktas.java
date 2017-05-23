package com.company;

import java.util.Scanner;

/**
 * Created by Andrius on 2017-05-23.
 */
public class tryliktas {
    private float skaicius;

    // 1 paprasyti vartotojo ivesti pirma skaiciu
    public void prasymas1() {
        System.out.println("iveskite skaiciu");
        Scanner skaneris = new Scanner(System.in);
        skaicius = skaneris.nextInt();
    }
    // 2 kvadrato skaiciavimas
    public double skaiciavimas(){
        double kvadratas = Math.pow(skaicius,2);
        return kvadratas;
    }
}
