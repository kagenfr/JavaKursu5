package Day22;

import java.util.HashSet;

public class Homework06 {
    public static void main(String[] args) {
//        Bir HashSet i mainde tanımlayınız. Daha Sonra bir fonksiyonda
//        random olarak toplamı 10 tane olacak şekilde 1 den 20 e kadar olan
//        sayılarla doldurunuz. Set i main de yazdırınız.

        HashSet<Integer> sayilar = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            sayilar.add(randomSayi());
        }

        System.out.println(sayilar);
    }
    public static int randomSayi() {
        return (int)(Math.random() * 20) + 1;
    }
}

