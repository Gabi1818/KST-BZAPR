package com.mycompany.bzapr_cv09_statistika;

import static java.lang.Double.NaN;
import java.util.Arrays;
import java.util.Random;

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
    
    //ukol:
    private boolean zkontrolujIndex(int index){
        if (index >= 0 && index < pole.length){
            return true;
        }
        else{
            throw new IndexOutOfBoundsException(
                "Neplatny index: " + index
            );
        }
    }
    
    public void nahradPrvek(int index, int novaHodnotaPrvku){
        zkontrolujIndex(index);
           
        pole[index] = novaHodnotaPrvku;
    }
    
    public void vypisPrvek(int index){
        zkontrolujIndex(index);
        
        System.out.println("prvek na indexu: " + index + " = " + pole[index]);
    }
    
    public void vypisPrvek(int indexOd, int indexDo){
        if (indexOd > indexDo) {
            throw new IllegalArgumentException("Spatne zadany rozsah indexu.");
        }
        
        int aktualniIndex = indexOd;
        while (true){
            zkontrolujIndex(aktualniIndex);
            
            System.out.println("prvek na indexu: " + aktualniIndex + " = " + pole[aktualniIndex]);
            
            aktualniIndex++;
            if (aktualniIndex > indexDo)
                return;
        }
    }
    
    public void vypisPrvek(int[] poleIndexu){
        for(int i = 0; i < poleIndexu.length; i++){
            zkontrolujIndex(poleIndexu[i]);
            
            System.out.println("prvek na indexu: " + poleIndexu[i] + " = " + pole[poleIndexu[i]]);
        }
    }
    
    /*
    public void preusporadejPole(){
        int[] novePole = new int[pole.length];
        
        Random random = new Random();
        
        for (int i = 0; i < pole.length; i++){
            int index = random.nextInt(0, pole.length);
            novePole[i] = pole[index]; 
        }
    }
    */


    @Override
    public String toString() {
        return "Statistika{" + "pole=" + Arrays.toString(pole) + '}';
    }
    
    
}
