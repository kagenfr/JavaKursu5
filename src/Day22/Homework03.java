package Day22;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Homework03 {
    public static void main(String[] args) {
        //commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
        //return tipi arraylist olmalı.
        //**ÖRNEĞİN:**
        //İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**
        //İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**
        //Ortak değerleri ArrayListe ekleyiniz.
        //çıktı:  "Germany" , "Brazil" ,"USA"
        //ArrayListi yazdırınız.

        Set<String> set1 = new TreeSet<>();
        set1.add("Germany");
        set1.add("England");
        set1.add("South Africa");
        set1.add("Brazil");
        set1.add("USA");

        Set<String> set2 = new TreeSet<>();
        set2.add("Germany");
        set2.add("China");
        set2.add("Brazil");
        set2.add("France");
        set2.add("USA");

        ArrayList<String> common = commonValues((TreeSet<String>) set1, (TreeSet<String>) set2);
        System.out.println(common);

    }

    public static ArrayList<String> commonValues(TreeSet<String> set1, TreeSet<String> set2) {
        ArrayList<String> common = new ArrayList<>();

        for (String s : set1) {
            if (set2.contains(s)) {
                common.add(s);
            }
        }

        return common;
    }
}
