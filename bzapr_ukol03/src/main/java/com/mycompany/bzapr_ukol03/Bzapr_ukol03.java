package com.mycompany.bzapr_ukol03;

import java.util.Scanner;

public class Bzapr_ukol03 {

    public static void main(String[] args) {
        //delka usecky
        //vstup kartezske souradnice ax, ay, bx, by, vystup je delka usecky

        double ax;
        double ay;
        double bx;
        double by;
        double delka;

        Scanner scanner = new Scanner(System.in);

        System.out.println("zadej ax: ");
        ax = scanner.nextDouble();

        System.out.println("zadej ay: ");
        ay = scanner.nextDouble();

        System.out.println("zadej bx: ");
        bx = scanner.nextDouble();

        System.out.println("zadej by: ");
        by = scanner.nextDouble();

        delka = Math.sqrt(Math.pow(bx - ax, 2) + Math.pow(by - ay, 2));

        System.out.println("delka usecky: " + delka);
    }
}
