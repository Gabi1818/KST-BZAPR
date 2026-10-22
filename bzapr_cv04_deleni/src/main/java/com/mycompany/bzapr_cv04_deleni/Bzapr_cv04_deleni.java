package com.mycompany.bzapr_cv04_deleni;

import java.util.Scanner;

public class Bzapr_cv04_deleni {

    public static void main(String[] args) {
        System.out.println("---deleni dvou cisel---");
        
        Scanner vstup = new Scanner(System.in);

        System.out.println("zadej prvni cislo (delenec): ");
        int a = vstup.nextInt();  
        
        System.out.println("zadej druhe cislo (delitel): ");
        int b = vstup.nextInt();  
        
        System.out.println("vysledek: " + (double) a / b);
        System.out.println("vysledek: " + Math.round((double) a / b));
        
        //2 desetinna mista
        System.out.println((double)(Math.round(((double) a / b) * 100)) / 100);

    }
}
