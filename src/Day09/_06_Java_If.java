package Day09;

import java.util.Scanner;

public class _06_Java_If {
    public static void main(String[] args) {
        //Girilen bir cümlede a harfinin geçip geçmediğini bulunuz geçiyorsa EVET geçmiyorsa HAYIR yazdırınız.

        Scanner read = new Scanner(System.in);

        System.out.print("Cümlenizi giriniz = ");

        String sentence = read.nextLine();

        //1. yol
        if ( sentence.contains("a") )
            System.out.println("EVET");

        if ( !sentence.contains("a") ) // !değilse  if ( cumle.contains("a")==false )
            System.out.println("HAYIR");

        // 2.Yol
        if (sentence.indexOf("a") != -1) // var ise index indexini verir
            System.out.println("EVET");

        if (sentence.indexOf("a") == -1)
            System.out.println("HAYIR");

        //3. yol
        boolean varMi = sentence.contains("a");

        if (varMi) {
            System.out.println("a harfi içeriyor mu? ");
            System.out.println("EVET");
        }

        if (!varMi) {
            System.out.println("a harfi içeriyor mu? ");
            System.out.println("HAYIR");
        }

    }
}
