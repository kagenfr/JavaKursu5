package Day22;

import java.util.LinkedHashSet;

public class Homework04 {
    public static void main(String[] args) {
        //removing() isminde bir method oluşturun.
        //Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
        //Eğer Stringler LinkedHashset 'in içinde varsa, sil.
        //Return tipi linkedhashset
        //Örneğin,
        //linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
        //String 1= Germany
        //String 2 = USA
        // **Germany ve USA 'i sil.**
        //Set'i döndür.

        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Germany");
        set.add("France");
        set.add("USA");
        set.add("Canada");
        set.add("Mexico");
        set.add("Brazil");

        LinkedHashSet<String> updatedSet = removing(set, "Germany", "USA");
        System.out.println("updatedSet = " + updatedSet);

    }public static LinkedHashSet<String> removing(LinkedHashSet<String> set, String str1, String str2) {
        set.remove(str1);
        set.remove(str2);
        return set;
    }
}
