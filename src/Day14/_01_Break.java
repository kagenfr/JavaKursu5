package Day14;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        //Girilen bir sayının, 2 aynı sayının çarpımına eşit olup olmadığını bulunuz.

        //4 girdim -> 2*2 tam karedir
        //5 girdim -> değildir
        //9 girdim -> 3*3 tam karedir

        Scanner read = new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int sayi = read.nextInt();

        //5 girildi , 5 e kadar olan sayıları 1,2,3,4
        //9 girildi , 9 kadar olan sayıları 1,2,'3',4,5,6,7,8

        int i = 0;
        boolean tamKare = false;
        while (i < sayi){

            System.out.println("i = " + i);

            if (i*i == sayi) {
                System.out.println("Sayı tam karedir");
                tamKare = true;
                break; //çalıştığında döngüden çıkar
            }
            i++;
        }
        if (tamKare == false)
            System.out.println("Tam kare değildir");
    }

}
