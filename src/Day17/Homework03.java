package Day17;

public class Homework03 {
    public static void main(String[] args) {
        //İnt Array oluştur ve elemanları : 25,30,30,35,100
        //Array in elemanlarının toplamını yazdır. Cevap 220 olmalı.

        int[] numbers = {25,30,30,35,100};

        int toplam = 0;
        for (int i = 0; i < numbers.length; i++) {

            toplam+=numbers[i];


        }
        System.out.println("toplam = " + toplam);

    }

}
