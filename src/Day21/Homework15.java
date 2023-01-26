package Day21;

import java.util.ArrayList;
import java.util.List;

public class Homework15 {
    public static void main(String[] args) {
        //getSum() isminde bir method oluşturun.
        //Parametresi ArrayList olmalı
        //Return tipi int olmalı.
        //ArrayList teki tüm sayıları birbiri ile toplayın.
        //return olarak toplam sonucu döndürün.
        //Örneğin;
        //Arraylist = 1,2,3,4,5
        //return 15 olmalı

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(getSum(list));

    }
    public static int getSum(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }
}
