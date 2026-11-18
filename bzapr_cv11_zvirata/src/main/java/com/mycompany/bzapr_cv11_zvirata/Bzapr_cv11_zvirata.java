package com.mycompany.bzapr_cv11_zvirata;

public class Bzapr_cv11_zvirata {

    public static void main(String[] args) {
        Pes pes1 = new Pes("Azor");
        Pes pes2 = new Pes("Alik");
        
//        pes1.stekej();
//        pes1.aportuj();
//        
//        pes2.stekej();
//        pes2.aportuj();
        
        Pes[] psi = { pes1, pes2, new Pes("Bobik") };
        for (Pes pes : psi) {
            pes.stekej();
        }
        
        Kocka kocka1 = new Kocka("Micka");
        
        Kocka[] kocky = { kocka1, new Kocka("Mourek") };
        for (Kocka kocka : kocky) {
            kocka.mnoukej();
        }
        
        Object[] zvirata = { pes1, pes2, psi[2], kocka1, kocky[1], "Karel", new int [5], new Integer(2) };
        
    }
}
