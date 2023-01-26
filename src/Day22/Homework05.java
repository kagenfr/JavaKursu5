package Day22;

import java.util.ArrayList;

public class Homework05 {
    public static void main(String[] args) {
        //Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
        //Store all the elements in one arraylist and print the arraylist
        //Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
        //**Örnek:**
        //```
        //**Girdi:**
        //[[ 1, 2, 3 ],
        // [ 4, 5, 6 ],
        // [ 7, 8, 9 ]]
        //**Çıktı:** [1,2,3,4,5,6,7,8,9]
        //```

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        ArrayList<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int element : row) {
                list.add(element);
            }
        }
        System.out.println(list);





    }
}
