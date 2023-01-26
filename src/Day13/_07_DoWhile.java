package Day13;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        //Kullanıcı 0 değeri girene kadar girdiği sayıların toplamını bulumunuz.

        Scanner read = new Scanner(System.in);

        int sayi;
        int toplam = 0;

        do { //döngü arası şart başta olmadığından en az 1 kez çalışır, kontrol sonda
            System.out.print("Sayı giriniz = ");
            sayi = read.nextInt();

            toplam = toplam + sayi;

        }while (sayi != 0);

        System.out.println("toplam = " + toplam);


    }
}
