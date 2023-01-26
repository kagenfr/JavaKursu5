package Day10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        //Girilen bir öğrenci notuna göre 50 den büyük eşit ise geçtiniz küçük ise kaldınız yazdırınız.

        Scanner read = new Scanner(System.in);
        System.out.print("Notu Giriniz = ");
        int ogrNot = read.nextInt();

        //1. Yöntem (Önceki)
        if (ogrNot >= 50)
            System.out.println("Geçtiniz");

        if (ogrNot < 50)
            System.out.println("Kaldınız");

        //2. Yöntem (olması gereken)
        if (ogrNot >= 50)
            System.out.println("Geçtiniz");
        else
            System.out.println("Kaldınız");
    }
}
