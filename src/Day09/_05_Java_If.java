package Day09;

import java.util.Scanner;

public class _05_Java_If {
    public static void main(String[] args) {
        //Girilen bir öğrenci notuna göre 50 den büyük-eşit ise geçtiniz, küçük ise kaldınız yazdırınız.

        Scanner read = new Scanner(System.in);

        System.out.print("Öğrenci adı = ");

        String ogrAd = read.nextLine();

        System.out.print("Notu giriniz = ");

        int ogrNot = read.nextInt();



        if (ogrNot >= 50)
            System.out.println("Geçtiniz!");

        if (ogrNot < 50)
            System.out.println("Kaldınız!");
    }
}
