package Day23;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class _05_SetsExample {
    public static void main(String[] args) {
        //10 elemanlı bir diziyi random 10(dahil) a kadar olan sayılarla doldurduktan,
        //tekrarlı değerleri almayacak şekilde yeni bir diziye atınız.

        Integer[] dizi = new Integer[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random()*11);

        }
        System.out.println("dizi = " + Arrays.toString(dizi));
        //1. yöntem
        HashSet<Integer> number = new HashSet<>();
        for (int i = 0; i < dizi.length; i++) {
            number.add(dizi[i]);
        }
        System.out.println("number = " + number);

        //2.yöntem
        HashSet<Integer> number2 = new HashSet<>(Arrays.asList(dizi));
        System.out.println("number2 = " + number2);
        
        //3.yöntem
        HashSet<Integer> number3 = new HashSet<>();
        Collections.addAll(number3,dizi);
        System.out.println("number3 = " + number3);
        







        }
        
        


        
    }

