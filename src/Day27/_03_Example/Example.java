package Day27._03_Example;

import java.util.ArrayList;
import java.util.Arrays;
// Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
// 1- Lesson : fields : name, saat (1-10 arasında değer alıyor).
// 2- Student: fields : name, maxSaat, dersleri adında derslerini listesini tutacak bir liste.
// 3- 3 adet ders oluşturunuz.
// 4- 1 adet öğrenci tanımlayınız alabileceği maxCredit si 10 olsun.
// 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
//    ders eklerken max alabileceği Saati geçmemeli, geçerse
//    uyarı versi, alabileceğiniz max Saati doldu şeklinde.
// 6- Unıversıte kurallarını yazdıran 2 maddelik bir not yazdıran metod ekleyinız.en basta
//    yazdırınız.
public class Example {
    public static void main(String[] args) {
        Rules();
        System.out.println();
        Lesson ders1 = new Lesson();
        ders1.name = "Algoritma";
        ders1.time = 4;

        Lesson ders2 = new Lesson();
        ders2.name = "Java";
        ders2.time = 4;

        Lesson ders3 = new Lesson();
        ders3.name = "Test Tools";
        ders3.time = 3;

        Student ogr1 = new Student();
        ogr1.stdntName = "Etka Bilgen";
        ogr1.maxSaat = 10;
        ogr1.dersEkle(ders1);
        ogr1.dersEkle(ders2);
        ogr1.dersEkle(ders3);
        ogr1.dersleriYazdir();




    }
public static void Rules() {
    System.out.println("\n************ Üniversitemize Hoşgeldiniz ************\n");
        System.out.println("\n*** Sınıf Kuralları ***\n");
    System.out.println("Kural 1 = Sınıfta yüksek sesle konuşmayınız. ");
    System.out.println("Kural 2 = Sınıfta sigara içmeyiniz.");
    System.out.println("Kural 3 = Sınıfta dikkat dağıtıcı ve dersi sabote edici şeyler yapmayınız");




}




}

