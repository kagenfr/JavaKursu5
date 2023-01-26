package Day10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen vize(%50) ve final(%50) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner read = new Scanner(System.in);
        System.out.print("Vize Notu =");
        int vizeNot = read.nextInt();

        System.out.print("Final Notu =");
        int finalNot = read.nextInt();

        double ortalama = ((vizeNot+finalNot)/2);

        if (ortalama >= 60)
            System.out.println("Geçtiniz");

        else
            System.out.println("Kaldınız");

    }
}
