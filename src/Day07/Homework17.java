package Day07;


public class Homework17 {
    public static void main(String[] args) {
        //Girilen bir kelimenin ilk ve son harfini bulunuz.

        String word = "Wonderful";

        int uzunluk = word.length();

        char firstLetter = word.charAt(0);

        char lastLetter = word.charAt(uzunluk-1);

        System.out.println("firstLetter = " + firstLetter);
        System.out.println("lastLetter = " + lastLetter);

    }
}
