package Day13;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        //3- Kullanıcnın gireceği bir sayıya kadar olan sayıların toplamını bulunuz.

        Scanner read = new Scanner(System.in);

        int sayi;
        int toplam = 0;

        do {
            System.out.print("Sayı giriniz = ");
            sayi = read.nextInt();
            toplam = toplam + sayi;

        }while (sayi < 20);

        System.out.println("toplam = " + toplam);












    }
}
