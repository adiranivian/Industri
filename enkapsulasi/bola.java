package enkapsulasi;

import java.util.Scanner;

public class bola {
    private double r;
    private double luasPermukaan, volume,jarijari;
    public bola (){
        
    }
    Scanner s = new Scanner(System.in);

    public void showDiameter(double r){
        System.out.println("Diameter: " + r*2);
    }
    public void showluasPermukaan(double r){
        System.out.println("Luas permukaan bola: " + (4*Math.PI*r*r) + "cm2");
    }
    public void showVolumeBola(double r){
        System.out.println("Volume bola: " + (4/3*Math.PI*r*r*r) + "cm3");
    }
    
    
}
