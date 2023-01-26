package Day17;

public class Homework07 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        //Array'in ortalamasını alınız.

        int[] numbers = {12,14,21,23,10,4};

        int toplam = 0;

        for (int i = 0; i < numbers.length; i++) {

            toplam+= numbers[i];
        }
        System.out.println("ortalama = " + toplam/ numbers.length);
    }

}
