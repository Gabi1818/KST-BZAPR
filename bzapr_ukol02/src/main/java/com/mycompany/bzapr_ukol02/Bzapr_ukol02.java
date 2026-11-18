package com.mycompany.bzapr_ukol02;

import java.util.Scanner;

public class Bzapr_ukol02 {

    public static void main(String[] args) {
        //prevod casu
        //vstup cas v sekundach, vystup dny hodiny minuty sekundy

        int sekundy;
        int minuty;
        int hodiny;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("zedej sekundy: ");
        sekundy = scanner.nextInt();
        
        hodiny = sekundy / (60 * 60);
        sekundy = sekundy % (60 * 60);
        
        System.out.println("hodiny: " + hodiny);
        //System.out.println(vsechnySekundy);
        
        minuty = sekundy / 60;
        sekundy = sekundy % 60;
        
        System.out.println("minuty: " + minuty);
        //System.out.println(vsechnySekundy);
        
        System.out.println("sekundy: " + sekundy);
    }
}
