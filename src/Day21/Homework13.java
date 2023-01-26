package Day21;

import java.util.ArrayList;
import java.util.List;

public class Homework13 {
    public static void main(String[] args) {
        //Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
        //Store all the elements in one arraylist and print the arraylist
        //Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
        //**Örnek:**
        //**Girdi:**
        //[[ 1, 2, 3 ],[ 4, 5, 6 ],[ 7, 8, 9 ]]
        //**Çıktı:** [1,2,3,4,5,6,7,8,9]

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                list.add(array[i][j]);
            }
        }
        System.out.println(list);


    }
}
