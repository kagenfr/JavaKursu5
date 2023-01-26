package Day15;

public class Homework4 {
    public static void main(String[] args) {
        //İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.
        //İlk 10 doğal sayı: 1,2,3,4,5,6,7,8,9,10

        int sayi = 10;
        int toplam = 0;

        for (int i = 1; i <= sayi; ++i) {

            toplam += i;

            System.out.println(i + ". Toplam = " + toplam);
        }

    }
}
