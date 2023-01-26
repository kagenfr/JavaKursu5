package Day17;

public class Homework01 {
    public static void main(String[] args) {
        //Bu String'i oluşturun. "Removes white space from both ends of a string"
        //String'deki kelime sayısını yazdırınız.

        String sentence = "Removes white space from both ends of a string";
        int sayac = 1;
        String[] words = sentence.split(" ");

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ')
                sayac++;



        }
        System.out.println("Kaç kelime vardır = " + sayac);



    }

}
