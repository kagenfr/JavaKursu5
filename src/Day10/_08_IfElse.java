package Day10;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123

        Scanner read = new Scanner(System.in);
        System.out.print("Aralarında bir boşluk bırakarak 3 sayı giriniz = ");
        String sayilar = read.nextLine();

        int bos1Ind = sayilar.indexOf(" ");
        int bos2Ind = sayilar.lastIndexOf(" ");

        int sayi1 = Integer.parseInt(sayilar.substring(0, bos1Ind));
        int sayi2 = Integer.parseInt(sayilar.substring(bos1Ind+1, bos2Ind));
        int sayi3 = Integer.parseInt(sayilar.substring( bos2Ind+1));

        if ((sayi1+sayi2+sayi3)%2 == 0)
            System.out.println("Çift");

        else
            System.out.println("Tek");



    }
}
