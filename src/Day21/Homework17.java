package Day21;

import java.util.ArrayList;

public class Homework17 {
    public static void main(String[] args) {
        //İsmi changelnArraylist() olan bir method oluşturun.
        //Parametre olarak String ArrayList, String s1, String s2
        //Arraylist'te s1'i s2 olarak değiştirin. Return String arrayList
        //Örneğin; Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        //s1 = blue, s2 = yellow
        //Tüm blue 'ları yellow'a dönüştürün.
        //cevap: "yellow" , "red" , "yellow" , "red" , "yellow"

        ArrayList<String> colors = new ArrayList<>();
        colors.add("yellow");
        colors.add("red");
        colors.add("blue");
        colors.add("red");
        colors.add("blue");

        colors = changelnArrayList(colors, "blue", "yellow");

        for (String color : colors) {
            System.out.print(" " +color);
        }
    }
    public static ArrayList<String> changelnArrayList(ArrayList<String> list, String s1, String s2) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(s1)) {
                list.set(i, s2);
            }

        }
        return list;
    }
}
