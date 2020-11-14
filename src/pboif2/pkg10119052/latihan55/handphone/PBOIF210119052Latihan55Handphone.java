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
public class PBOIF210119052Latihan55Handphone {

    public static void main(String[] args) {
        int harga = 3000000;
        
        Android android = new Android("kay store",  "samsung", "Android", "Grand", 3000000);
        android.displayproduct();
        android.setKeystore("234ibfd3840fo");
        android.getKeystore();
        
        Blackberry blackberry = new Blackberry("pinbb", "BlackB","RIM" ,"Curve", 2000000);
        blackberry.displayproduct();
        blackberry.setPinbb("BHS249");
        blackberry.getPinbb();
        
        Windowsphone windowsphone = new Windowsphone("WP KEY", "Nokia","Win8" ,"Lumia", 1000000);
        windowsphone.displayproduct();
        windowsphone.setWpkeystore("UUUQIJWORJ");
        windowsphone.getWpkeystore();
        }
    }
    
