package Day05;

import java.util.Scanner;

public class _09_Example8 {
    public static void main(String[] args) {
        //Kullanıcıdan ağırlığını double, boyunu double olarak alınız
        //ve bir satırda boyunuz ve kilonuz şeklinde yazdırınız.
        //Vücut kitle endeksini de bularak yazdırınız. -> kg / (boy*boy)

        Scanner oku = new Scanner(System.in);

        System.out.print("Kilo=");
        Double kilo = oku.nextDouble();

        System.out.print("Boy=");
        Double boy = oku.nextDouble();

        Double kitleIndex = kilo / (boy * boy);

        System.out.println("kilo = " + kilo + ", boy = " + boy);
        System.out.println("kitleIndex = " + kitleIndex);


    }
}
