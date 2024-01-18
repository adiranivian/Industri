package enkapsulasi;

import java.util.Scanner;

public class ujiBola {
    public static void main(String[] args) {
        bola bola = new bola();
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan jari-jari: ");
        double plusjarijari=s.nextDouble();
        bola.showDiameter(plusjarijari);
        bola.showluasPermukaan(plusjarijari);
        bola.showVolumeBola(plusjarijari);

    }
    
}
