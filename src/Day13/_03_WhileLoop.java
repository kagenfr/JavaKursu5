package Day13;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        //Girilen 20 sayının toplamının sonucunu ekrana yazdırınız.

        Scanner read = new Scanner(System.in);


        int sayac = 1;
        int toplam = 0;

        while (sayac<=20){
            System.out.print(sayac + ".Sayı Giriniz = ");
            int sayilar = read.nextInt();
            toplam = toplam+sayilar;

            sayac++;



        }
        System.out.println("toplam = " + toplam);
        
    }
}
