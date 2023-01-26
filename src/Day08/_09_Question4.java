package Day08;

import java.util.Scanner;

public class _09_Question4 {
    public static void main(String[] args) {
        //Girilen bir cümledeki ilk kelimeyi yazdırınız.

        Scanner read = new Scanner(System.in);

        System.out.print("Cümlenizi giriniz = ");

        String cumle = read.nextLine();

        int boslukIndex = cumle.indexOf(" ");

        String ilkKelime = cumle.substring(0, boslukIndex);

        System.out.println("ilkKelime = " + ilkKelime);
    }
}
