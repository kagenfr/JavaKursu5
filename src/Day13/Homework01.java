package Day13;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        //1- Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz

        Scanner read = new Scanner(System.in);


        int i = 1;
        int toplam = 0;


        while (i < 3) {
            System.out.print(i + ".Sayı giriniz = ");
            int tekSayi = read.nextInt();

            if (tekSayi % 2 != 0) {
                toplam = toplam + tekSayi;
            }
            i++;
        }
        System.out.println("toplam = " + toplam);


    }
}