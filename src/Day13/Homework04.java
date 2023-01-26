package Day13;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        //4- Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.

        Scanner read = new Scanner(System.in);

        int sayilar;
        int sayac = 1;
        int toplam = 0;

        while (sayac<=5){
            System.out.print(sayac + ".Sayı Giriniz = ");
            sayilar = read.nextInt();

                toplam = toplam+sayilar;

            sayac++;
        }
        System.out.println("toplam = " + toplam);

    }
}
