package Day24;

import java.util.HashMap;

public class _01_Maps {
    public static void main(String[] args) {
        //Set -> HashSet , LinkedHashSet, TreeSet
        //Map -> HashMap, LinkedHashMap, TreeMap
        //Map -> Anahtar + Set -> Anahtarlı Set

        //anahtarın tipi Integer, Değerinin tipi String olsun
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1001, "Etka Bilgen");
        hm.put(1002, "Erva Bilgen");
        hm.put(2001, "Enes Bilgen");
        hm.put(5001, "Emir Bilgen");
        hm.put(1002, "Gamze Bilgen");

        System.out.println("hm = " + hm);
        System.out.println("hm.get(2001) = " + hm.get(2001));

        System.out.println("hm.containsKey(2001) = " + hm.containsKey(2001));
        System.out.println("hm.containsKey(12) = " + hm.containsKey(12));

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());
        
        hm.remove(5001);
        System.out.println("hm = " + hm);

        System.out.println("hm.size() = " + hm.size());
        
        hm.clear();
        System.out.println("hm = " + hm);


        
        
    }
}
