package Day12;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {
        //0-5 arası gibi sayılar ürettik, hep sıfırdan başladı.
        //4-9 arası ürettirmek için; önce aralık kadar normal üret (9-4) yani
        //0-5 arası üretilmiş sayıya min sayı ekle, üretilmiş sayı +4
        //(int)(Math.Random()*(max-min))+min
        
        //Girilen max ve min aralığında random sayı ürettiriniz.
        Scanner read = new Scanner(System.in);
        System.out.print("min = ");
        int min = read.nextInt();

        System.out.print("max = ");
        int max = read.nextInt();
        
        int rndSayi = (int)(Math.random()*(max-min)) + min;
        System.out.println("rndSayi = " + rndSayi);
    }
    
    
    
}
