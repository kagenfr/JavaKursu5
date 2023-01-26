package Mentoring;

import java.util.Scanner;

public class Quiz10 {
    public static void main(String[] args) {
        // Ornek 3 : Kullanici tarafindan girilen 5 pozitif sayinin toplamini hesaplayan
        // Sayi 100 den buyuk ise hatali giris yapildigi ikazi vererek programi sonlandiran kodu yaziniz...

        int sayi, toplam = 0;
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " . Sayıyı gir = ");
            sayi = read.nextInt();
            if (sayi < 0) {
                continue;
            } else if (sayi > 100) {
                System.out.println("Hatalı giriş yaptınız");
                break;

            }
            toplam+= sayi;


        }
        System.out.println("toplam = " + toplam);


    }
}