package Day13;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
        //6- Bir sayı bulmaca oyunu yapılmak isteniyor
        //bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,
        //Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,
        //bilemediniz yazıp tutulan sayıyı bildirsin.
        //Eğer bilirse tebrikler yazsın.

        Scanner read = new Scanner(System.in);
        System.out.print("Min = ");
        int min = read.nextInt();

        System.out.print("Max = ");
        int max = read.nextInt();

        int rndSayi = (int)(Math.random()*(max-min)) + min;

        System.out.print("Tahmininiz = ");
        int tahmin = read.nextInt();

        if (tahmin == rndSayi)
            System.out.println("Tebrikler");
        else if (tahmin == rndSayi)
            System.out.println("Tebrikler");
        else if (tahmin == rndSayi)
            System.out.println("Tebrikler");
        else
            System.out.println("Bilemedin");




    }
}
