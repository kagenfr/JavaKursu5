package Day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Homework14 {
    public static void main(String[] args)  {
        //ismi getCount() olan bir method oluşturun.
        //Parametre olarak bir String ArayList  ve  bir tane String
        //Return tipi int olmalı. ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        //Örneğin; ArrayList = Orange , Kiwi , Peach , Banana , Orange
        //String Orange:
        //Count = 2 olmalı. (Orange 2 kez yazılmış)

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Kiwi");
        fruits.add("Peach");
        fruits.add("Banana");
        fruits.add("Orange");

        int count = getCount(fruits, "Orange");

        System.out.println("Count: " + count);
    }
    public static int getCount(ArrayList<String> list, String str) {
        int count = 0;

        for (String s : list) {
            if (s.equals(str)) {
                count++;
            }
        }
        return count;
    }


    }

