package Day09;

import java.util.Scanner;

public class _01_Java_If {
    public static void main(String[] args) {
        //Baklava dilimiz  ->  if
        //Girilen bir sayı 10 dan büyük ise ekrana 10 dan büyük yazdırınız
        //Algoritma
        //1-Başla
        //2-sayi oku sayi=oku.nextInt();
        //3-sayi > 10 ise "10 dan büyük" yaz -> if (sayi > 10) sout......
        //4-Dur

        Scanner read = new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int sayi = read.nextInt();

        if (sayi > 10)  //if komutundan sonra noktalı virgül kullanılmaz kullanılırsa çalışmaz.
        {//if şartı sağlandığında yapılacakların parantezi
            System.out.println("10 dan büyük");
            System.out.println("if in içinde birden fazla komut varsa if parantezleri şarttır");

        }
    }

}
