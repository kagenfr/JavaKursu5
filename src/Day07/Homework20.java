package Day07;

import java.util.Scanner;

public class Homework20 {
    public static void main(String[] args) {
        //3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.E.Y. şeklinde yazınız.

        Scanner read = new Scanner(System.in);

        System.out.print("Adınız ve Soyadınız = ");
        String adSoyad = read.nextLine();

        char adIlkHarf1 = adSoyad.charAt(0);
        int boslukIndex = adSoyad.indexOf(" ");
        char adIlkHarf2 = adSoyad.charAt(1);
        int $boslukIndex = adSoyad.indexOf(" ");
        char soyadIlkHarf = adSoyad.charAt($boslukIndex+1);

        System.out.println(adIlkHarf1 + "." + adIlkHarf2 + "." + soyadIlkHarf + ".");
    }
}
