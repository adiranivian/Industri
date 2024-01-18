package enkapsulasi;

import java.util.Scanner;

public class busTayo {
    private double penumpang, maxpenumpang, counter, penumpangBaru;
    double berat;
    public void addPenumpang(double penumpang){
        this.penumpang=penumpang;

    }
    public double getPenumpang(){
        return penumpang;
    }
    Scanner s = new Scanner(System.in);
    public double plusBerat(){
        counter=getPenumpang();
        for (int i=0; i < counter; i++){
            System.out.println("Masukkan Berat penumpang " + (i+1));
            berat+= s.nextDouble();
        }
        return berat;
    }
    public double getRataRata(){
        return berat/getPenumpang();
    }

    public void cetak(){
        System.out.println("Jumlah penumpang: " + penumpang);
        System.out.println("Total berat: "+ berat + "kg");
        System.out.println("Rata-rata berat penumpang: " + getRataRata()+ "kg");
    }
    
}
