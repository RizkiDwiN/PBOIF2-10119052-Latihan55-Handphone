package pboif2.pkg10119052.latihan55.handphone;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis handphone dengan metode polimorpism
 * 
 */
public class Handphone {
   protected String manufacture,operatingsystem,model;
   protected int harga;

    public Handphone(String manufacture, String operatingsystem, String model, int harga) {
        this.manufacture = manufacture;
        this.operatingsystem = operatingsystem;
        this.model = model;
        this.harga = harga;
    }
   public void displayproduct(){
       System.out.println("Manufaktur : "+this.manufacture );
       System.out.println("OS : "+this.operatingsystem);
       System.out.println("Model : "+this.model);
       System.out.println("Harga : "+this.harga);
   } 
}
