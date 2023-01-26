package Day13;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {
        //Kullanıcı 0 değeri girene kadar girdiği sayıların toplamını bulumunuz.

        Scanner read = new Scanner(System.in);

        int sayi;
        int toplam = 0;

        System.out.print("Sayı giriniz = ");
        sayi = read.nextInt();

        toplam = toplam + sayi;

        while (sayi != 0){
            System.out.print("Sayı giriniz = ");
            sayi = read.nextInt();

            toplam = toplam + sayi;
        }
        System.out.println("toplam = " + toplam);
    }
}
