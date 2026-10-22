package com.mycompany.bzapr_ukol01;

import java.util.Scanner;

public class Bzapr_ukol01 {

    public static void main(String[] args) {
        //Vytvořte program pro  řešení/výpočet kořenů kvadratické rovnice.

        //Na vstupu jsou z klávesnice načteny hodnoty koeficientů a, b, c kvadratické 
        //rovnice a*x^2 + b*x + c = 0
        //V případě, že koeficienty reprezentují kvadratickou rovnici, program určí 
        //řešení (2 reálné kořeny, jeden reálný dvojnásobný kořen, dva sdružené 
        //kořeny v oblasti komplexních čísel).
        //Pokud se nejedná o kvadratickou rovnici (a=0), potom program vypíše 
        //upozornění a následně určí řešení i pro tyto varianty lineární 
        //rovnice (a=0, b<>0 ; a=0, b=0, c<>0 ; a=0, b=0, c=0)
        
        double a;
        double b;
        double c;
       
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("a * x^2 + b * x + c");
        System.out.println("zadej a: ");
        a = scanner.nextDouble();
        
        System.out.println(a + " * x^2 + b * x + c");
        System.out.println("zadej b: ");
        b = scanner.nextDouble();
        
        System.out.println(a + " * x^2 + " + b + " * x + c");
        System.out.println("zadej c: ");
        c = scanner.nextDouble();
        
        System.out.println(a + " * x^2 + " + b + " * x + " + c);
        
        
        if(a != 0){ //kvadraticka rovnice
            double diskriminant;
            //ax^2+bx+c=0
            System.out.println("kvadraticka rovnice:");
            System.out.println(a + " * x^2 + " + b + " * x + " + c);
            System.out.println("-----------------------------------");
            //D=b^2-4ac
            //x = (-b + odm(b^2-4ac) / 2a
            
            diskriminant = b * b - 4 * a * c;
            
            //D>0 
            if (diskriminant > 0){
                System.out.println("rovnice ma 2 ruzne realne koreny: ");
                double x1;
                double x2;
                
                x1 = (-b + Math.sqrt(diskriminant)) / (2 * a);
                x2 = (-b - Math.sqrt(diskriminant)) / (2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
            
            //D=0 
            else if (diskriminant == 0){
                System.out.println("rovnice ma 1 realny koren: ");
                double x;
                
                x = -b / (2 * a);
                System.out.println("x = " + x);
            }
            
            //D<0 
            else if (diskriminant < 0){
                System.out.println("rovnice nema realne koreny, ale ma 2 komplexni sdruzene koreny: ");
                             
                double realnaCast = -b / (2 * a);
                double imaginarniCast = Math.sqrt(-diskriminant) / (2 * Math.abs(a));

                System.out.println("x1 = " + realnaCast + " + " + imaginarniCast + "i");
                System.out.println("x2 = " + realnaCast + " - " + imaginarniCast + "i");
            }
            
            else{
                System.out.println("neznama chyba v diskriminantu");
            }
            

        }
        else if (a == 0){
            System.out.println("nejedna se o kvadratickou rovnici");

            
            //a=0, b<>0 ; a=0, b=0, c<>0 ; a=0, b=0, c=0
            if (a == 0 && b != 0){
                //bx + c = 0
                System.out.println(b + " * x " + c + " = 0");
                System.out.println("-----------------------------------");
                
                double x = - c / b;
                System.out.println("x = " + x);
            }
            else if (a == 0 && b == 0 && c != 0){
                System.out.println("c == 0 && c != 0");
                System.out.println("-----------------------------------");
                System.out.println("rovnice nema reseni");
            }
            else if (a == 0 && b == 0 && c == 0){
                System.out.println("0 = 0");
                System.out.println("-----------------------------------");
                System.out.println("rovnice ma nekonecne mnoho reseni");
            }
        }

    }
}
