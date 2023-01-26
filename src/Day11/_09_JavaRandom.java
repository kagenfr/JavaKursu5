package Day11;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner read = new Scanner(System.in);
        System.out.print("Üretilecek sayı sınırı = ");
        int sinir = read.nextInt();

        int tutulanSayi = (int)(Math.random()*sinir);

        System.out.print("Tahmininiz = ");
        int tahmin = read.nextInt();

        if (tahmin == tutulanSayi)
            System.out.println("Tebrikler");
        else
            System.out.println("Bilemedin");
    }
}
