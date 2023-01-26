package Day06;

import java.util.Scanner;

public class _01_Example01 {
    public static void main(String[] args) {
        // Kullanıcıdan Cadde, Sokak , PostaKodu(int) ve ülke şeklinde
        // adres bilgisi alarak yazdırınız.

        Scanner readStr = new Scanner(System.in);   //String ve Integer işlemleri için iki farklı Scanner tanımlamak
        Scanner readInt = new Scanner(System.in);   //işlemlerin karışmamasını sağlar.

        System.out.print(" Cadde= ");
        String cadde = readStr.nextLine();

        System.out.print(" Sokak= ");
        String sokak = readStr.nextLine();

        System.out.print(" Posta Kodu= ");
        int postaKodu = readInt.nextInt();

        System.out.print(" Ülke= ");
        String ulke = readStr.nextLine();

        System.out.println("cadde = " + cadde);
        System.out.println("sokak = " + sokak);
        System.out.println("postaKodu = " + postaKodu);
        System.out.println("ulke = " + ulke);


    }

}
