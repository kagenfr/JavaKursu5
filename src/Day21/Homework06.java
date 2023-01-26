package Day21;

import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {
        //Girilen bir diziyi tersten yazdıran bir metod yazınız.

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        reverseArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tersten = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tersten;
        }

    }
}
