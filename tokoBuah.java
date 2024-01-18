public class tokoBuah {
    public static void main(String[] args) {
        System.out.println("Grand Opening Buah Segar ");
        tokoBuah s = new tokoBuah();
        s.namaPembeli();
        System.out.println("Total Belanja: Rp. " + s.totalBelanja(200000));
    }
    public void namaPembeli(){
        String nama = "Aliyah";
        System.out.println("Nama Pembeli: " + nama);
    
    }
    public double totalBelanja(double belanja){
        double totalBelanja= belanja - (0.20*belanja);
        return totalBelanja;
    }
}
