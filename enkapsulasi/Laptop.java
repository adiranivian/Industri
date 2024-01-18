package enkapsulasi;

public class Laptop {
    public String merk;
    private int ukuran;
    public String warna;
    protected int harga;

    public void setUkuran(int Ukuran){
        this.ukuran=Ukuran;
    }

    public int getUkuran(){
        return ukuran;
    }

}
