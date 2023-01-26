package Day21;

import java.util.Arrays;

public class Homework08 {
    public static void main(String[] args) {
        //`append adında bir method oluşturun.`
        //`Parametre olarak iki int array  oluşturun.`
        //ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
        //Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
        //Bunu döndürmelidir: {2, 4, 6, 1, 2, 3, 4, 5}.

        int[] first = {2, 4, 6};
        int[] second = {1, 2, 3, 4, 5};
        int[] result = append(first, second);
        System.out.println(Arrays.toString(result));
    }

    public static int[] append(int[] a, int[] b) {
        int[] result = Arrays.copyOf(a, a.length + b.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;

    }
}
