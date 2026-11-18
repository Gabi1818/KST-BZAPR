package com.mycompany.bzapr_cv10_kruznice;

public class Bzapr_cv10_kruznice {

    public static void main(String[] args) {
        Kruznice k1 = new Kruznice();
        System.out.println("k1: " + k1);
        
        Kruznice k2 = new Kruznice(5, 7, 2);
        System.out.println("k2: " + k2);
        
        Kruznice k3 = k1;
        System.out.println("k3: " + k3);
        
        k1.posunStred(5, -3);
        System.out.println("k3: " + k3);
        
        System.out.println("kruznice k1 a k3 " + (k1.maPrusecikSKruznici(k3) ? "maji" : "nemaji") + " prusecik.");
        System.out.println("kruznice k1 a k2 " + (k1.maPrusecikSKruznici(k2) ? "maji" : "nemaji") + " prusecik.");
    }
    
//    public static boolean majiKruznicePrusecik(double sx1, double sy1, double r1, double sx2, double sy2, double r2){
//        double vzdalenost = vzdalenost2Bodu(sx1, sy1, sx2, sy2);
//        double soucetPolomeru = r1 + r2;
//        
//        if (sx1==sx2 && sy1==sy2 && r1==r2)
//            return true;
//        else if (sx1==sx2 && sy1==sy2 && r1!=r2)
//            return false;
//        
//        
//        if (vzdalenost <= soucetPolomeru) 
//            return true;
//        
//        return false;
// 
//        
//    }
//    
//    public static double vzdalenost2Bodu(double x1, double y1, double x2, double y2){
//        double dx = x2 - x1;
//        double dy = y2 - y1;
//        
//        return Math.sqrt(dx * dx + dy * dy);
//    }
}
