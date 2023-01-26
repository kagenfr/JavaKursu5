package Day21;

import java.util.ArrayList;

public class Homework16 {
    public static void main(String[] args) {
        //getLength() isminde bir method oluşturun.
        //Parametre olarak String ArrayList
        //Return tipi Integer ArrayList
        //ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
        //Tüm elementlerin uzunluğunu döndürün
        //Örneğin; ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        //Tüm Stringlerin uzunluklarını yazdırın; cevap: 10 ,  8 , 4 , 7 , 6 olmalı

        ArrayList<String> cities = new ArrayList<>();
        cities.add("New jersey");
        cities.add("New york");
        cities.add("Ohio");
        cities.add("Florida");
        cities.add("Boston");

        ArrayList<Integer> lengths = getLength(cities);

        for (int length : lengths) {
            System.out.print("  " + length);
        }
    }
    public static ArrayList<Integer> getLength(ArrayList<String> list) {
        ArrayList<Integer> lengths = new ArrayList<>();

        for (String str : list) {
            lengths.add(str.length());
        }
        return lengths;

    }
}
