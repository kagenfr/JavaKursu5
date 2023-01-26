package Day17;

public class Homework11 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 12,2,5,15,8
        //En büyük değeri yazdırınız.

        int[] numbers = {12,2,5,15,8};

        int enBuyuk;

        enBuyuk = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > enBuyuk)
                enBuyuk = numbers[i];
        }
        System.out.println("En büyük değer = " + enBuyuk);

    }

}
