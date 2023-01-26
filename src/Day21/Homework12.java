package Day21;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        //Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        //[{"new jersey","atlanta","ohio"}, {"Pittsburgh" ,"ohio","new york","ohio"},
        // {"ohio","new york"}]  Bütün ohio'ları Florida'yla değiştiriniz. Array'i yazdırınız.

        String[][] array = {{"new jersey", "atlanta", "ohio"}, {"Pittsburgh", "ohio", "new york", "ohio"}, {"ohio", "new york"}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equals("ohio")) {
                    array[i][j] = "Florida";
                }
            }
        }
        System.out.println(Arrays.deepToString(array));


    }
}
