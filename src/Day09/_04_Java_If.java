package Day09;

import java.util.Scanner;

public class _04_Java_If {
    public static void main(String[] args) {
        //Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner read = new Scanner(System.in);

        System.out.print("Sayı giriniz = ");

        int sayi = read.nextInt();

        if (sayi%2 != 0)
            System.out.println("Sayı tek");

        if (sayi%2 == 0)
            System.out.println("Sayı çift");
    }
}
