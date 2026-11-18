package com.mycompany.bzapr_cv11_zvirata;

public class Kocka {
    private String jmeno;
    private boolean drapkyVysunuty;

    public Kocka(String jmeno) {
        this.jmeno = jmeno;
        this.drapkyVysunuty = false;
    }
    
    public void mnoukej(){
        System.out.println(jmeno + ": \"mnauk\"");
    }
    
    public void vysunDrapky(){
        drapkyVysunuty = true;
    }
    
    public void zasunDrapky(){
        drapkyVysunuty = false;
    }
    
    public boolean maVysunuteDrapky(){
        return drapkyVysunuty;
    }
}
