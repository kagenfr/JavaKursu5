package Day08;

import java.util.Scanner;

public class _08_Question3 {
    public static void main(String[] args) {
        //Girilen bir sayının tek sayı olup olmadığını yazdırınız.

        Scanner read = new Scanner(System.in);

        System.out.print("Sayı giriniz = ");
        int sayi = read.nextInt();
        
        int kalan = sayi % 2; //bu 1 e eşitse tekdir
        System.out.println("tek mi ? = " + (kalan==1));

        //2. yöntem
        System.out.println("tek mi ? = " + (sayi%2 == 1));

        //3. yöntem
        System.out.println("tek mi ? = " + (sayi%2 != 1));
        //negatif girilme ihtimali sebebi ile bu en doğru yöntem, çünkü bir üstte negatif girilirse -1 gelir.

        
    }
}
