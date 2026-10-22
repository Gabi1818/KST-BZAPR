package com.mycompany.bzapr_cv07_pole;

public class Bzapr_cv07_pole {

    public static void main(String[] args) {
        int[] znamky = { 2, 4, 5, 2, 1};
        int soucet = 0;
        
        for(int i = 0; i < znamky.length; i++){
            soucet += znamky[i];
        }
        
        System.out.println("soucet: " + soucet);
        float prumer = soucet / (float)znamky.length;
        int vyslednaZnamka = Math.round(prumer);
        System.out.println("prumer: " + prumer);
        System.out.println("vysledna znamka: " + vyslednaZnamka);
        
        //hledac nejhorsi znamky
        double nejhorsiZnamka = znamky[0];
        for(int i =0; i < znamky.length; i++){
            if(znamky[i] > nejhorsiZnamka){
                nejhorsiZnamka = znamky[i];
            }
        }
        System.out.println("nejhorsi znamka: " + nejhorsiZnamka);
    }
}
