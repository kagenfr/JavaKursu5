package Day21;

public class Homework02 {
    public static void main(String[] args) {
        //"OrtaKelime" isminden bir method oluşturun.
        //Bu method String'i parametre olarak almalı.
        //Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
        //Ortadaki kelimeyi return yapınız.
        //Örnek: Ben Java'yı seviyorum. print : Java'yı
        //Örnek2: Java'yı kolayca öğreniyorum. print: kolayca

        System.out.println(middleWord("I Love Java "));

    }
    public static String middleWord(String ortaKelime) {
        String[] words = ortaKelime.split(" ");
        int middle = words.length / 2;
        return words[middle];
    }
}
