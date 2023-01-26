package Day23;

import java.util.HashSet;
import java.util.Iterator;

public class _04_Sets {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(5);
        hs.add(7);
        hs.add(34);
        hs.add(3);

        System.out.println("hs.size() = " + hs.size());

        //remove
        hs.remove(5);
        System.out.println("remove sonrası hs = " + hs);

        //contains
        if (hs.contains(7)){
            System.out.println("var");

        }else
            System.out.println("yok");

        //clear
        hs.clear();
        System.out.println("hs = " + hs);









    }
}
