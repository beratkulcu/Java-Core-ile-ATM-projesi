package oop;

import javax.swing.text.html.HTMLWriter;

public class Runner {
    public static void main(String[] args) {

        ATM atm = new ATM();


        Hesap hesap = new Hesap("Berat Kulcu","1313",2000);
        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor . ");
    }


}
