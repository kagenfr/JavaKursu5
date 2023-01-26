package Day13;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        //5- 100 kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.

        Scanner read = new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int sayi = read.nextInt();

        int i = 1;
        int birler = sayi % 10;

        if (birler == 5)
            i = i + birler;

        System.out.println("toplam kaç tane 5 var? = " + birler);
      }



   }

