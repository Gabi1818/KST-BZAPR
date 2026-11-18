package com.mycompany.bzapr_cv11_zvirata;

public abstract class Zvire {
    protected String jmeno;

    public Zvire(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    
    public abstract void ozviSe();

    @Override
    public String toString() {
        return "Zvire{" + "jmeno=" + jmeno + '}';
    }
}
