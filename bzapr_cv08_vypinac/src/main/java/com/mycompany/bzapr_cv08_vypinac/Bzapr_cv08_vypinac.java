package com.mycompany.bzapr_cv08_vypinac;

public class Bzapr_cv08_vypinac {

    public static void main(String[] args) {
        Vypinac v1 = new Vypinac();
//        Vypinac v2 = new Vypinac(true);
//        Vypinac v3 = new Vypinac(false);
        
        v1.zapni();
        
        System.out.println(v1.toString());
        //System.out.println(v1.poloha);
    }
}
