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
public class Windowsphone extends Handphone{
    private String wpkeystore;

    public Windowsphone(String wpkeystore, String manufacture, String operatingsystem, String modal, int harga) {
        super(manufacture, operatingsystem, modal, harga);
        this.wpkeystore = wpkeystore;
    }

    public String getWpkeystore() {
        System.out.println("Wp Key Store : "+wpkeystore);
        System.out.println("");
        return wpkeystore;
    }

    public void setWpkeystore(String wpkeystore) {
        this.wpkeystore = wpkeystore;
    }
}
