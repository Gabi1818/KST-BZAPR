package com.mycompany.bzapr_cv11_zvirata;

public class Bzapr_cv11_zvirata {

    public static void main(String[] args) {
        Pes pes1 = new Pes("Azor");
        Pes pes2 = new Pes("Alik");
        Kocka kocka1 = new Kocka("Micka");
        
//        pes1.stekej();
//        pes1.aportuj();
//        
//        pes2.stekej();
//        pes2.aportuj();
        
//        Pes[] psi = { pes1, pes2, new Pes("Bobik") };
//        for (Pes pes : psi) {
//            pes.stekej();
//        }
//        
//        Kocka[] kocky = { new Kocka("Micka") };
//        for (Kocka kocka : kocky) {
//            kocka.mnoukej();
//        }

        Zvire[] zvirata = { pes1, pes2, kocka1 };
        
        for (Zvire zvire : zvirata) {
            zvire.ozviSe();
        }
        
        Utulek utulek = new Utulek(3);
        utulek.pridej(kocka1);
        utulek.pridej(pes1);
        utulek.pridej(pes2);
        utulek.pridej(new Kocka("Cmoud"));
        
        
    }
}
