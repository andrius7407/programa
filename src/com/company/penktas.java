package com.company;

import java.util.Scanner;

/**
 * Created by Andrius on 2017-05-23.
 */
public class penktas {
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

    //3 metodo iskvietimas
    public void vykdyk() {
        skaiciuok(skaicius1, skaicius2);
        skaiciuok((float) skaicius1, (float) skaicius2);
    }


    // 4 suskaiciuoti suma
    public void skaiciuok(float a, float b) {
        float suma = skaicius1 + skaicius2;
        System.out.println("suma yra " + suma);
    }

    // 5 suskaiciuoti skirtuma
    public void skaiciuok(int a, int b) {
        float skirtumas = skaicius1 - skaicius2;
        System.out.println("skirtumas yra " + skirtumas);
    }
}
