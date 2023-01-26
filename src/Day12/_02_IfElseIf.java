package Day12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanıcıdan alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        //2 sayı aldıktan sonra,
        //Toplama -> T
        //Çıkarma -> Ç
        //Çarpma -> P
        //Bölme -> B

        //girilen işlem isteğine göre sonucu yazdıracaksın.

        Scanner read = new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int sayi1 = read.nextInt();

        System.out.print("Sayı giriniz = ");
        int sayi2 = read.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Çıkarma için Ç");
        System.out.println("Çarpma için P");
        System.out.println("Bölme için B");
        System.out.print("Seçiminiz = ");

        Scanner readStr = new Scanner(System.in);
        String secim = readStr.next();

        //ladder sistemi (yani merdiven sistemi)
        if (secim.equalsIgnoreCase("T"))
            System.out.println("toplamı = " + (sayi1+sayi2));
        else
            if (secim.equalsIgnoreCase("Ç"))
                System.out.println("farkı = " + (sayi1-sayi2));
            else
                if (secim.equalsIgnoreCase("P"))
                    System.out.println("çarpımı = " + (sayi1*sayi2));
                else
                    if (secim.equalsIgnoreCase("B"))
                        System.out.println("bölümü = " + (sayi1/sayi2));
                    else
                        System.out.println("Yanlış seçim");
    }
}
