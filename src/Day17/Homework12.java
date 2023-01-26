package Day17;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        //String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        //Eğer aitse "true" çevirin. Loops (döngüler) kullanın.

        String[] fruits = {"Apple","Orange","Banana","Pineapple"};

       for (int i = 0; i < fruits.length; i++) {
            if (Arrays.binarySearch(fruits,"Apple") == 0) {
                System.out.println("true");
                break;
            }else
                System.out.println("false");

        }
    }

}
