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
public class Android extends Handphone{
     private String keystore;

    public Android(String keystore, String manufacture, String operatingsystem, String modal, int harga) {
        super(manufacture, operatingsystem, modal, harga);
        this.keystore = keystore;
    }
    
    public String getKeystore() {
        System.out.println("android Key Store : "+keystore);
        System.out.println("");
        return keystore;
    }

    public void setKeystore(String keystore) {
        this.keystore = keystore;
    }
}
