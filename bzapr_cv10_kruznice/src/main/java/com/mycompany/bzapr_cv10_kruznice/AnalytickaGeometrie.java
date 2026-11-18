package com.mycompany.bzapr_cv10_kruznice;

public class AnalytickaGeometrie {
        public static double vzdalenost2Bodu(double x1, double y1, double x2, double y2){
        double dx = x2 - x1;
        double dy = y2 - y1;
        
        return Math.sqrt(dx * dx + dy * dy);
    }
}
