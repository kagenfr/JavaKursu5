package Day25._04_Example;

import java.util.ArrayList;
import java.util.Scanner;

public class NotDefteri {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        ArrayList<Ogrenci> sinif = new ArrayList<>();

        for (int i = 0; i < 2; i++) {

            Ogrenci ogrNot = new Ogrenci();
            System.out.print("Öğrencinin adı = ");
            ogrNot.tamAd = scannerStr.nextLine();
            System.out.print("Öğrencinin okul numarası = ");
            ogrNot.okulNo = scannerInt.nextInt();
            System.out.print("Öğrencinin Notu = ");
            ogrNot.not = scannerInt.nextInt();

            System.out.println();
            sinif.add(ogrNot);

        }
        bilgileriYazdir(sinif);
        ortalamaYaz(sinif);
    }

    public static void bilgileriYazdir(ArrayList<Ogrenci> sinif) {
        for (Ogrenci ogr : sinif) {
            System.out.println("Okul No = " + ogr.okulNo);
            System.out.println("Adı = " + ogr.tamAd);
            System.out.println("Notu = " + ogr.not);
            System.out.println();
        }


    }

    public static void ortalamaYaz(ArrayList<Ogrenci> sinif) {

        int toplam = 0;
        for (Ogrenci ogr : sinif) {
            toplam += ogr.not;


        }
        System.out.println("Ortalama = " + toplam / sinif.size());


    }


}