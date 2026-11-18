package com.mycompany.bzapr_cv11_zvirata;

public class Pes {
    private String jmeno;

    public Pes(String jmeno) {
        this.jmeno = jmeno;
    }
    
    public void stekej(){
        System.out.println(jmeno + ": \"haf haf\"");
    }
    
    public void aportuj(){
        System.out.println(jmeno + " bezim za mickem");
        System.out.println(jmeno + " bezim s mickem zpet");
    }
}
