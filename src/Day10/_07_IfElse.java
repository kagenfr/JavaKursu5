package Day10;

import java.util.Objects;
import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67

        Scanner read = new Scanner(System.in);
        System.out.print("Sayıları 1 boşluk bırakarak giriniz = ");
        String sayilar = read.nextLine();

        int boslukIndex = sayilar.indexOf(" ");
        String strSayi1 = sayilar.substring(0, boslukIndex);
        String strSayi2 = sayilar.substring(boslukIndex+1);

        int sayi1 = Integer.parseInt(strSayi1);
        int sayi2 = Integer.parseInt(strSayi2);

        if (sayi1 == sayi2)
            System.out.println("Eşit");
        else
            System.out.println("Eşit Değil");


    }
}
