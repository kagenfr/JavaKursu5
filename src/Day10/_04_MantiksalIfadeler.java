package Day10;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {
        //&& = ve işareti
        //|| = veya işareti

        // Girilen sayı pozitif ve tek ise , ekrana uygun sayı girildi
        // degilse uygun sayı girilmedi yazdırınız.

        Scanner read = new Scanner(System.in);
        System.out.print("Sayı = ");
        int sayi = read.nextInt();

        //hem tek hem pozitif -> sayi%2==1 && sayi > 0

        if (sayi % 2 == 1 && sayi > 0)
            System.out.println("uygun sayı girildi");

        else
            System.out.println("uygun sayı girilmedi");


    }


}
