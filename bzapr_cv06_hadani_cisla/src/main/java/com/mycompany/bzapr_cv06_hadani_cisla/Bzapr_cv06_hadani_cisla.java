package com.mycompany.bzapr_cv06_hadani_cisla;

import java.util.Random;
import java.util.Scanner;

public class Bzapr_cv06_hadani_cisla {

    public static void main(String[] args) {
        System.out.println("zadej cislo od 1 do 10: ");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
                
        int uzivatelskaVolba = scanner.nextInt();
        int volbaPocitace = 0;
        
        if (uzivatelskaVolba < 1 || uzivatelskaVolba > 10){
            System.out.println("zadane spatne cislo");
        }
        else{
            volbaPocitace = random.nextInt(1, 11);
            System.out.println("volba pocitace " + volbaPocitace);
            
            if (uzivatelskaVolba == volbaPocitace){
                System.out.println("cisla se schoduji");
            }
            else{
                System.out.println("cisla se neschoduji");
            }
        }

    }
}
