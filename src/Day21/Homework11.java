package Day21;

public class Homework11 {
    public static void main(String[] args) {
        //Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        //2D array'de olan elemanları toplayınız. Toplamı yazdırınız. Sonuç 32 olmalıdır.

        int[][] array = {{5, 2, 1}, {10, 2, 3, 6}, {1, 2}};
        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                toplam += array[i][j];
            }
        }
        System.out.println(toplam);

    }
}
