package com.mycompany.bzapr_cv08_vypinac;

public class Vypinac {
    private boolean poloha; //atribut

    public Vypinac(boolean poloha) { //parametr
        this.poloha = poloha;
    }
    
    public Vypinac(){
        poloha = false;
    }

    public boolean isPoloha() {
        return poloha;
    }

    private void setPoloha(boolean poloha) {
        this.poloha = poloha;
    }
    
    public void zapni(){
//        poloha = true;
        setPoloha(true);
    }
    
    public void vypni(){
//        poloha = false;
        setPoloha(false);
    }
    
    public void prepni(){
//        poloha = !poloha;
        if (isPoloha()){
            vypni();
        }
        else{
            zapni();
        }
    }

    @Override
    public String toString() {
        return "Vypinac{" + "poloha=" + (poloha ? "zapnuto" : "vypnuto") + '}';
    }
    
    
}
