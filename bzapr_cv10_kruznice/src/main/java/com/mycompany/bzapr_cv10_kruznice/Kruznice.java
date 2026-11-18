package com.mycompany.bzapr_cv10_kruznice;

public class Kruznice {
    private double sx, sy;
    private double r;

    
    public Kruznice(double sx, double sy, double r) {
        this.sx = sx;
        this.sy = sy;
        this.r = r;
    }
    
    public Kruznice(){
        this(0,0,1);
    }
    
    public Kruznice(Kruznice k){
        this(k.sx, k.sy, k.r);
    }
    
    public Kruznice(double sx, double sy){
        this(sx, sy, 1);
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }
    
    public void nastavStred(double sx, double sy){
        this.sx = sx;
        this.sy = sy;
    }
    
    public void posunStred(double dx, double dy){
        this.sx += dx;
        this.sy += dy;
    }

    @Override
    public String toString() {
        String vystup;
        vystup = "Kruznice{" + "sx=" + sx + ", sy=" + sy + ", r=" + r + '}';
        vystup = String.format("Kruznice{stred [%3.1f, %3.1f], polomer = %3.1f", sx, sy, r);
        return vystup;
    }
    
    public boolean maPrusecikSKruznici(Kruznice k){
        double vzdalenost = AnalytickaGeometrie.vzdalenost2Bodu(this.sx, this.sy, k.sx, k.sy);
        double soucetPolomeru = this.r + k.r;
        
        if (this.sx==k.sx && this.sy==k.sy && this.r==k.r)
            return true;
        else if (this.sx==k.sx && this.sy==k.sy && this.r!=k.r)
            return false;
        
        
        if (vzdalenost <= soucetPolomeru) 
            return true;
        
        return false;
 
        
    }
    
//    private double vzdalenost2Bodu(double x1, double y1, double x2, double y2){
//        double dx = x2 - x1;
//        double dy = y2 - y1;
//        
//        return Math.sqrt(dx * dx + dy * dy);
//    }
    
    
}
