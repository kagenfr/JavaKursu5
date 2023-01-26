package Day11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        //Girilen bir sayının pozitif, negatif veya sıfır olduğunu ternary operatörü ile yazdırınız.

        Scanner read = new Scanner(System.in);
        System.out.print("Sayı = ");
        int sayi = read.nextInt();

        System.out.println((sayi > 0) ? "pozitif" : (sayi == 0) ? "sıfır" : "negatif" );
    }
}
