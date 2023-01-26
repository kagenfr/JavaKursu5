package Day05;

import java.util.Scanner;

public class _02_Example {
    public static void main(String[] args) {
        //Girilen bir adı ekrana yazdırınız.

        Scanner okuyucu = new Scanner(System.in);

        System.out.print("adınızı giriniz=");
        String ad = okuyucu.next(); //next() ekrandan bir kelime okur

        System.out.println("ad = " + ad);
        /*
          okuyucu.next();        ->  bir kelime okur
          okuyucu.nextLine();    ->  satırın tümünü okur
          okuyucu.nextInt();     ->  int değeri okur
          okuyucu.nextShort();   ->  short değeri okumak için
          okuyucu.nextByte();    ->  long değeri okumak için
          okuyucu.nextFloat();   ->  float değeri okumak için
          okuyucu.nextDouble();  ->  double değeri okumak için
          okuyucu.nextBoolean(); ->  true veya false girişi için
        */
    }
}
