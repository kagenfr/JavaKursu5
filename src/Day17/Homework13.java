package Day17;

import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {
        //Bu şekilde bir String oluşturunuz. "$12 $23 $10 $2 $5 $2"
        //$ işaretlerini kaldırın ve sayıları toplayın.
        //Sayıların toplamını yazdırın.

        String[] numbers = {"$12","$23","$10","$2","$5","$2"};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(" " + numbers[i].replace("$", ""));

        }
        int[] numbers2 = {12,23,10,2,5,2};
        int toplam = 0;

        for (int i = 0; i < numbers2.length; i++) {
            toplam+=numbers2[i];
            
        }
        System.out.println("toplam = " + toplam);
    }
}


















