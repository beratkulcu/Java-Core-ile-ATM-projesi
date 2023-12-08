package oop;

import java.util.Scanner;

public class Login {

    public  boolean login(Hesap hesap){

        Scanner scanner = new Scanner(System.in);
        String kulaniciAdi ;
        String parola;

        System.out.println("Kullanıcı Adı : " );
        kulaniciAdi = scanner.nextLine();
        System.out.println("Parola :  ");
        parola = scanner.nextLine();

        if (hesap.getKullaniciAdi().equals(kulaniciAdi) && hesap.getParola().equals(hesap.getParola())){
            return  true;
        }else {
            return  false;
        }



    }
}
