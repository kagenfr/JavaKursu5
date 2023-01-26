package Day20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        //Kullanıcının gireceği 2 sayının toplamını
        //bir fonksiyonda buldurup, bunun sonucunu main de yazdırınız.

        Scanner read = new Scanner(System.in);
        System.out.print("1. Sayı giriniz = ");
        int sayi1 = read.nextInt();

        System.out.print("2. Sayı giriniz = ");
        int sayi2 = read.nextInt();

        int toplam = toplamSayi(sayi1, sayi2);
        System.out.println("toplam = " + toplam);
    }

    public static int toplamSayi(int sayi1, int sayi2) {
        int toplam = 0;
        return sayi1+sayi2;




    }
}



