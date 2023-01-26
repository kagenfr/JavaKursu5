package Day16;

import java.util.ArrayList;

public class _06_JavaArrayHomework {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz. trt, kanald, atv, fox, habertürk
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazıdırnız.

        String[] kanallar = {"trt", "kanald", "atv", "fox", "habertürk"};

        int rastgele = (int) (Math.random()* kanallar.length);
        System.out.println("Rastgele Seçilen Tv Kanalı = " + kanallar[rastgele]);



    }
}
