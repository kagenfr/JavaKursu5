package Day18;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {

        int sayi = 0; //1 tane sayı
        int[] dizi = new int[100]; //100 tane sayı

        int[] ders1Notlari = new int[50]; //50 kişilik sınıfın 1. dersin notları
        int[] ders2Notlari = new int[50];
        int[] ders3Notlari = new int[50]; //0-49 arası index değişiyor

        int[][] tumDersNotlari = new int[3][50]; //3 tane ders 50 tane öğrenci, 150 tane sayı
                                                 //3 satır 50 sütun
                                                 //Her satır 50 tane sayı, 50 sütun
                                                 //0.satır, 1.satır, 2.satır
                                                 //satır: 0,1,2    sütun: 0,1,2,3,......,49

        ders1Notlari[0] = 80; //tek boyutlu dizinin ilk(=) elemanına 80 değerini atadım
        tumDersNotlari[0][0] = 80; //2 boyutlu dizide 0.satırın, 0.sütununa 80 değeri atandı

        System.out.println("tumDersNotlari[0][0] = " + tumDersNotlari[0][0]);

        Scanner read = new Scanner(System.in);
        tumDersNotlari[0][0] = read.nextInt();
    }
}
