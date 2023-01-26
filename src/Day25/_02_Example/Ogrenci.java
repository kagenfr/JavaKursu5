package Day25._02_Example;

import java.util.ArrayList;
import java.util.Scanner;

public class Ogrenci {
    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        ArrayList<Student> sinif = new ArrayList<>();


        for (int i = 0; i < 3; i++) {

            Student ogr = new Student();
        System.out.print("Öğrencinin Adı = "); ogr.ad = scannerStr.nextLine();
        System.out.print("Öğrencinin Soyadı = "); ogr.soyad = scannerStr.nextLine();
        System.out.print("Öğrencinin Sınıfı = "); ogr.sinif = scannerInt.nextInt();
        System.out.print("Öğrencinin Adresi = "); ogr.adres = scannerStr.nextLine();

        sinif.add(ogr);
        }
        System.out.println();

        for (Student ogr:sinif) {

        System.out.println("Öğrencinin Adı = " + ogr.ad);
        System.out.println("Öğrencinin Soyadı = " + ogr.soyad);
        System.out.println("Öğrencinin Sınıfı = " + ogr.sinif);
        System.out.println("Öğrencinin Adresi = " + ogr.adres);

        }
    }
}
class Student {
    public String ad;
    public String soyad;
    public int sinif;
    public String adres;



}