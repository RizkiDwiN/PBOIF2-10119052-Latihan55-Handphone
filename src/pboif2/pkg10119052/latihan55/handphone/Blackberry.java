/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Blackberry extends Handphone{
    private String pinbb;

    public Blackberry(String pinbb, String manufacture, String operatingsystem, String modal, int harga) {
        super(manufacture, operatingsystem, modal, harga);
        this.pinbb = pinbb;
    }

    public String getPinbb() {
        System.out.println("Pin : "+pinbb);
        System.out.println("");
        return pinbb;
    }

    public void setPinbb(String pinbb) {
        this.pinbb = pinbb;
    }
}
