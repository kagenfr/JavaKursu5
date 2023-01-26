package Day32._03_Example;

import java.util.ArrayList;
import java.util.Scanner;

//  1- fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız.
//  2- Ogrenci sınıfına ad, soyad  ve yas dan oluşan bir consructor tanımlayınız.
//  3- Bütün fieldlar için encapsulation uygulayınız.
//  4- okul isimli bir class tanımlayınız, fieldları okulAd, kontenjan,
//     ArrayList cinsinden Öğrencileri olsun.
//  5- main metodunun olduğu OkulMain isimli bir sınıf oluşturunuz.
//  6- bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar kullanıcıdan alarak
//     öğrenci ekleyiniz. Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
//     bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
//  7- Öğrencilerin hepsine eşsiz bir ID ataması yapınız.
public class SchoolMain {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        School newSchool = new School("Kabataş Okulu", 3);

        do {
            System.out.print("Öğrenci Adı = "); String ad = scannerStr.nextLine();
            System.out.print("Öğrenci Soyadı = "); String soyad = scannerStr.nextLine();
            System.out.print("Öğrenci Yaşı = "); int yas = scannerInt.nextInt();

            if (yas < 15){
                Student student = new Student(ad,soyad,yas);
                newSchool.getStudents().add(student);
            }
            else
                System.out.println("Öğrenci yaşı okul için uygun değil");

        }while (newSchool.getStudents().size() < newSchool.getQuota());

        System.out.println("Öğrenciler = " + newSchool.getStudents());


    }


}
