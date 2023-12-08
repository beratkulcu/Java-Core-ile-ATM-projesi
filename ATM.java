package oop;

import java.util.Scanner;

public class ATM {

    public void calis (Hesap hesap){

        Login login = new Login();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz : ");

        System.out.println("**************************************");
        System.out.println("Kullanıcı Girişi ");
        System.out.println("**************************************");

        int giris_hakki = 3 ;

        while (true){
            if(login.login(hesap)){
                System.out.println("Giriş Başarılı ");
                break;
            }else {
                System.out.println("Giriş Başarısız ");
                giris_hakki -= 1;
                System.out.println("Kalan Giriş Hakkı : " + giris_hakki);
            }

            if (giris_hakki == 0){
                System.out.println("Giriş hakkı bitti uygulamadan çıkılıyor ");
                return;
            }
        }

        System.out.println("*******************************************************");
        String islemler = "1. Bakiye Görüntüle \n"
                + "2. Para yatırma \n "
                + "3. Para çekme \n " +
                " çıkış için q ya basınız \n";
        System.out.println(islemler);
        System.out.println("*****************************************************************");

        while (true){

            String islem = scanner.nextLine();
            System.out.println("işlem seçiniz ");
            if (islem.equals("q")){
                break;
            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz : " + hesap.getBakiye());
            } else if (islem.equals("2")) {
                System.out.println("Yatırmak istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            }
            else if (islem.equals("3")){
                System.out.println( "Çekmek istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                hesap.paraÇek(tutar);
            } else{

            }

        }



    }
}
