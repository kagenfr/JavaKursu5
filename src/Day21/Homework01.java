package Day21;

import java.util.Random;

public class Homework01 {
    public static void main(String[] args) {
       //Ismi **randomNum** olan bir method oluşturun.
        //Parametre olarak **int max** almalı.
        //Bu method, 0 ile max arasında random bir değer döndürmelidir.
        //Random numarayı döndürünüz.

        System.out.println(randomNum(10));
    }

    public static int randomNum(int max) {
        Random randomSayi = new Random();
        return randomSayi.nextInt(max + 1);
    }
}
