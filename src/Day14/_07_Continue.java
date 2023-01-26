package Day14;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {
        //Kullanıcıdan 5 sayı isteyiniz, bu sayılardan 6 ile 10 arasındakiler hariç diğerlerini toplasın.

        Scanner read = new Scanner(System.in);

        int toplam = 0;
        for (int i=0; i<5; i++){
            System.out.print("Bir sayı giriniz = ");
            int sayi = read.nextInt();

            if (sayi >=6 && sayi <=10)
                continue;

            toplam+=sayi;
            System.out.println("toplam = " + toplam);


        }
    }
}
