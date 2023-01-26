package Day11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        //Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner read = new Scanner(System.in);
        System.out.print("Sayı = ");
        int sayi = read.nextInt();

        //1. yöntem
        if (sayi % 2 == 0)
            System.out.println("çift");
        else
            System.out.println("tek");

        //2. yöntem  //bu yöntem 1. yöntemin aynısıdır ve genelde kullanılır
        String sonuc = (sayi % 2 == 0) ? "çift" : "tek"; //? -> if  : -> else anlamına geliyor
        System.out.println("sonuc = " + sonuc);

        //3. yöntem
        System.out.println((sayi % 2 == 0) ? "çift" : "tek");
    }
}
