package com.mycompany.bzapr_cv09_statistika;

import static java.lang.Double.NaN;
import java.util.Arrays;

public class Statistika {
    private int pole[];

    /**
     * testovaci konstruktor, ktery do pole vlozi testovaci sadu cisel 1,2,3,4,5
     */
    public Statistika() {
        pole = new int[] {1,2,3,4,5};
    }

    public Statistika(int[] pole) {
        this.pole = pole;
    }
    
    public double soucet(){
        int soucet = 0;
        
        for(int i = 0; i < pole.length; i++){
            soucet += pole[i];
        }
        return soucet;
    }
    
    public double prumer(){
        if (pole.length > 0){
            return soucet() / pole.length;    
        }
        return NaN;
    }
    
    public void nahradPrvek(int index, int novaHodnotaPrvku){
        //kontrola
    }
    
    public void vypisPrvek(int index){
        
    }
    
    public void vypisPrvek(int indexOd, int indexDo){
    
    }
    
    public void vypisPrvek(int[] poleIndexu){
    
    }
    
    public void smerodatnaOdchylka(){
    
    }
    
    public void preusporadejPole(){
    
    }
    
    public void serad(){
    
    }

    @Override
    public String toString() {
        return "Statistika{" + "pole=" + Arrays.toString(pole) + '}';
    }
    
    
}
