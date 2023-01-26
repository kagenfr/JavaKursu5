package Day10;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        //Girilen bir sayının tek mi çift mi olduğunu yazdırınız

        Scanner read = new Scanner(System.in);
        System.out.print("Sayı Giriniz =");
        int sayi = read.nextInt();

        int kalan = sayi %2;

        if (kalan == 0)
            System.out.println("Çift");

        else
            System.out.println("Tek");

    }
}
