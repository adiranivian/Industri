package enkapsulasi;

import java.util.Scanner;

public class ujiBusTayo {
    public static void main(String[] args) {
        busTayo busTayo = new busTayo();
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan jumlah penumpang: ");
        double jumlah=s.nextDouble();
        busTayo.addPenumpang(jumlah);
        busTayo.plusBerat();
        busTayo.cetak();
        
    }
    
}
