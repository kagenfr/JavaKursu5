package Day22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Homework02 {
    public static void main(String[] args) {
        //changeSet() isminde bir method oluşturun.
        //Parametre olarak bir String HashSet   ve  iki String
        //return hashset olmalı
        //Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
        //**ÖRNEK:**
        //hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
        //String 1 = **banana**
        //String 2 = **peach**
        //**CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"

        HashSet<String> set = new HashSet<>();
        set.add("banana");
        set.add("strawberry");
        set.add("kiwi");
        set.add("pineapple");

        HashSet<String> changedSet = changeSet(set, "banana", "peach");
        System.out.println("changedSet = " + changedSet);

    }public static HashSet<String> changeSet(HashSet<String> set, String str1, String str2) {
        if (set.contains(str1)) {
            List<String> list = new ArrayList<>(set);
            int index = list.indexOf(str1);
            list.remove(index);
            list.add(index, str2);
            set = new LinkedHashSet<>(list);

        }return set;
    }
}
