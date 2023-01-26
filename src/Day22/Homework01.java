package Day22;

import java.util.HashSet;

public class Homework01 {
    public static void main(String[] args) {
        //Create a method totalCount()
        //totalCount() isminde bir method oluşturun.
        //Parametresi  'Integer Hashset' olmalı
        //HashSetteki eleman sayısını alın.
        //totalCount'u döndürün.
        //_**Örnek:**_
        //hashset ; 4,2,3,1,7
        //cevap: 5

        HashSet<Integer> hashset = new HashSet<>();

        hashset.add(4);
        hashset.add(2);
        hashset.add(3);
        hashset.add(1);
        hashset.add(7);

        int totalCount = totalCount(hashset);

        System.out.println("totalCount: " + totalCount);

    }public static int totalCount(HashSet<Integer> hashset) {
        return hashset.size();
    }
}
