package Mentoring;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        String word = "Techno Study";
        String number = "123";

        //Soru 1: Stringlerin uzunluğunu bulunuz.

        System.out.println("uzunluk = " + word.length());
        System.out.println("uzunluk2 = " +  number.length());


        //Soru 2: Word string değerindeki tüm harfleri küçük harfe çeviriniz.

        System.out.println("word = " + word);
        System.out.println("new word = " + word.toLowerCase());

        //Soru 3: tüm harfleri büyük hale getiriniz.

        System.out.println("new word 2 = " + word.toUpperCase());
        
        //Soru 4: bu stringlerde "h" harfi var mı?

        System.out.println(word.contains("h"));
        System.out.println(word.contains("H"));
        System.out.println(number.contains("h"));

        //Soru 5: "Techno" kelimesini ekrana yazdırınız.

        System.out.println("First word = " + word.substring(0,6));

        //Soru 6: iki string değeri birleştiriniz.
        String newStr = word.concat(number);
        System.out.println("newStr = " + newStr);
        System.out.println("word + number = " + word.concat(" "+number));



    }

}
