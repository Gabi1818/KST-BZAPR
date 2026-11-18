package com.mycompany.bzapr_cv11_zvirata;

public class Utulek {
    private Zvire[] pole;
    private int aktualniNaplneni;

    public Utulek(int maximalniKapacita) {
        pole = new Zvire[maximalniKapacita];
        aktualniNaplneni = 0;
    }
    
    public void pridej(Zvire noveZvire){
        try{
            pole[aktualniNaplneni] = noveZvire;
            aktualniNaplneni++;
            System.out.println("zvire pridano");
        } catch(Exception e){
            System.out.println("utulek je plny");
        }

    }
}
