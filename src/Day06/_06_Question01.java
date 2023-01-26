package Day06;

import java.util.Scanner;

public class _06_Question01 {
    public static void main(String[] args) {
        //Girilen bir ad soyadı "Etka Bilgen" E.B. şeklinde yazdırınız.

        Scanner read = new Scanner(System.in);

        System.out.print("Adınız ve Soyadınız = ");
        String adSoyad = read.nextLine();

        //Etka Bilgen -> E.B. -> E -> charAt(0) E. verir.
        //indexof(" ") -> boşluğun indexini veriyor, bunun bir fazlası charAt() -> B yi verir.

        char ilkHarf = adSoyad.charAt(0);      //E
        int boslukIndex = adSoyad.indexOf(" "); //Boşluk
        char soyadIlkHarf = adSoyad.charAt(boslukIndex+1); //B

        System.out.println(ilkHarf + "." + soyadIlkHarf+ ".");
        //char soyadIlkHarf= adSoyad.charAt(adSoyad.indexOf(" ")+1);
    }
}
