package Day09;

import java.util.Scanner;

public class _02_Java_If {
    public static void main(String[] args) {
        //Girilen bir sayının negatif mi, pozitif mi olduğunu yazdırınız, eğer sıfır ise sıfır yazdırınız.

        Scanner read = new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int sayi = read.nextInt();

        if (sayi < 0)
            System.out.println("Sayı negatif");

        if (sayi > 0)
            System.out.println("Sayı pozitif");

        if (sayi == 0)
            System.out.println("Sıfır");

    }

}
