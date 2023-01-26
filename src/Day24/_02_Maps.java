package Day24;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class _02_Maps {
    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1001, "Etka Bilgen");
        hm.put(1002, "Erva Bilgen");
        hm.put(2001, "Enes Bilgen");
        hm.put(5001, "Emir Bilgen");
        hm.put(1002, "Gamze Bilgen");

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());
        
        for (Integer k : hm.keySet()){
            //System.out.println("k = " + k);
            System.out.print(k + "\t");
        }
        System.out.println();

        for (String v: hm.values()) {
            System.out.print(v + "\t");

        }
        System.out.println();

        for (Map.Entry<Integer,String> kv:hm.entrySet()) {
            System.out.println(kv.getKey() + " - " + kv.getValue());

            
        }
    }
}
