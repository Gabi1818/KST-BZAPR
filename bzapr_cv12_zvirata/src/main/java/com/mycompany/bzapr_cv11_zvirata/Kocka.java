package com.mycompany.bzapr_cv11_zvirata;

public class Kocka extends Zvire {
    private boolean drapkyVysunuty;

    public Kocka(String jmeno) {
        super(jmeno);
        this.drapkyVysunuty = false;
    }

//    public void mnoukej(){
//        System.out.println(jmeno + ": \"mnauk\"");
//    }
    
    public void vysunDrapky(){
        drapkyVysunuty = true;
    }
    
    public void zasunDrapky(){
        drapkyVysunuty = false;
    }
    
    public boolean maVysunuteDrapky(){
        return drapkyVysunuty;
    }

    @Override
    public void ozviSe() {
        System.out.println(jmeno + ": \"mnauk\"");
    }
}
