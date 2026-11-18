package com.mycompany.bzapr_cv11_zvirata;

public class Pes extends Zvire{

    public Pes(String jmeno) {
        super(jmeno);
    }
    
//    public void stekej(){
//        System.out.println(jmeno + ": \"haf haf\"");
//    }
    
    public void aportuj(){
        System.out.println(jmeno + " bezim za mickem");
        System.out.println(jmeno + " bezim s mickem zpet");
    }
    
    @Override
    public void ozviSe(){
        System.out.println(jmeno + ": \"haf haf\"");
    }
}
