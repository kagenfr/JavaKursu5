package Day17;

public class Homework10 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        //En küçük (minimum) sayıyı yazdırınız.

        int[] numbers = {14,19,5,21};

        int enKucuk;

        enKucuk = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < enKucuk)
                enKucuk = numbers[i];
        }
        System.out.println("En büyük değer = " + enKucuk);

    }

}
