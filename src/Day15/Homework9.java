package Day15;

public class Homework9 {
    public static void main(String[] args) {
        //Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.

        //Sonuç böyle olmalıdır;
        //       *
        //      * *
        //     * * *
        //    * * * *
        //   * * * * *

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print("*" + " ");

            System.out.println();
        }
    }
}
