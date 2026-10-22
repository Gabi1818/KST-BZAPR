package com.mycompany.bzapr_cv05_obdelnik;

import java.util.Scanner;

public class Bzapr_cv05_obdelnik {

    public static void main(String[] args) {
        System.out.println("---obvod a obsah obdelniku---");
        
        Scanner vstup = new Scanner(System.in);
        int stranaA, stranaB;
        
        System.out.println("zadej stranu A: ");
        stranaA = vstup.nextInt();
        
        System.out.println("zadej stranu B: ");
        stranaB = vstup.nextInt();
        
        int obsah = stranaA * stranaB;
        int obvod = 2 * (stranaA + stranaB);
        
        System.out.println("obsah: " + obsah);
        System.out.println("obvod: " + obvod);
    }
}
