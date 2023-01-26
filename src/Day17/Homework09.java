package Day17;

public class Homework09 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int[] numbers = {15,25,22,18,30};

        int enBuyuk;
        int ikinci;

        enBuyuk = numbers[0];
        ikinci=numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > enBuyuk) {
                ikinci = enBuyuk;
                enBuyuk = numbers[i];
            } else if (numbers[i] > ikinci)
                ikinci = numbers[i];
        }
        System.out.println("En büyük ikinci değer = " + ikinci);
    }

}
