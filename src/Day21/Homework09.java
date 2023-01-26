package Day21;

import java.util.HashSet;
import java.util.Set;

public class Homework09 {
    public static void main(String[] args) {
        //**isUnique** adında bir method oluşturun.
        //Parametre olarak int array alır.
        //ve bu dizideki değerlerin benzersiz olup olmadığını gösteren
        //bir boolean değeri döndürür (benzerlik yoksa true, var ise false).
        //örneğin, list isminde bir array'imiz varsa,
        //int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
        //Bu listede yinelenen eleman olmadığı için sonuç true dönmelidir.
        //int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
        //Bu listede eleman 3, iki tane olduğu için sonuç false dönmelidir.

        int[] list1 = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
        int[] list2 = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
        System.out.println(isUnique(list1));
        System.out.println(isUnique(list2));
    }

    public static boolean isUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int numbers : arr) {
            if (set.contains(numbers)) {
                return false;
            }
            set.add(numbers);
        }
        return true;

    }
}
